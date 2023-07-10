public class lecture08 {
    public static int lastOccurence(int arr[], int key , int i){
        if(i == arr.length-1){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1  && arr[i] == key ){
            return i;
         }
     return isFound;
    }
    
    public static void main(String args[]){
       int arrr[ ] = { 8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccurence(arrr, 5, 0));
    }
}
