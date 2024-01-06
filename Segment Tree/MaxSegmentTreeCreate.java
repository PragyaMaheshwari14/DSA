public class MaxSegmentTreeCreate {
    static int tree[];

    public static void initialization(int n){
        tree = new int[4*n];
    }
    
    public static void buidTree(int arr[], int i, int si, int sj){ // O(n)
        if( si == sj){
            tree[i] = arr[si];
            return;
        }
        int mid = (si+sj) / 2;
        buidTree(arr, 2*i+1, si, mid); //left
        buidTree(arr, 2*i+2, mid+1, sj); //right

        tree[i] = Math.max(tree[2*i+1], tree[2*i+2]);
    }
    public static int getMax(int arr[], int qi, int qj){ //O(logn )
          int n = arr.length;
          return getMaxUtil(0, 0, n-1, qi, qj);
    }

    public static int getMaxUtil(int i, int si, int sj, int qi, int qj) {
        if(si > qj || sj < qi){ // no overlap case
            return Integer.MIN_VALUE;
        } else if ( si >= qi || sj < qj){ // complete overlap case
            return tree[i];
        }else{ // partial overlap
            int mid = (si + sj) / 2;
            int leftans = getMaxUtil(2*i+1 ,si, mid, qi,qj);
            int rightans = getMaxUtil(2*i+2, mid+1, sj, qi, qj);
            return Math.max(leftans, rightans);
          }
    }

    public static void update(int arr[], int idx, int newVal){ //O(logn)
        arr[idx] = newVal;
        int n = arr.length;
        updateUtil(0, 0, n-1, idx, newVal);
    }
    public static void updateUtil(int i, int si, int sj, int idx, int newVal){  //O(logn)
        if(idx < si || idx > sj) { //doesn't lie in range
            return;
        }

        tree[i] = Math.max(tree[i] , newVal);// non leaf node
        if(si != sj){
            int  mid = (si + sj) / 2;
            updateUtil(2*i+1, si, mid, idx, newVal);//left
            updateUtil(2*i+2, mid+1, sj, idx, newVal);//right
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {6,8,-1,2,17,1,3,2,4};
        int n = arr.length;
        initialization(n);
        buidTree(arr, 0, 0, n-1);
        for(int i=0; i<tree.length; i++){
            System.out.print(tree[i] + " ");
        }
        System.out.println();
       int max =   getMax(arr, 2, 5);
       System.out.println(max);//17

        update(arr, 2, 20);
        max = getMax(arr, 2, 5);
        System.out.println(max);

    }
}
