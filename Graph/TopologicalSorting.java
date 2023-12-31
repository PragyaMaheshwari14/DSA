import java.util.ArrayList;
import java.util.Stack;
import java.util.*;

public class TopologicalSorting {
      static class Edge {
        int src;
        int dest;

        public Edge(int s, int d){
           this.src = s;
           this.dest = d;

        }
    }
    static void createGraph(ArrayList<Edge> graph[]) { // True-> No Cycle
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        
        graph[2].add(new Edge(2,3));
        
        graph[3].add(new Edge(3,1));     
       
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(3,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
       
    }
      // O(V+E)
     // using DFS approach
    // public  static void topSort(ArrayList<Edge> graph[]) {
    //     boolean vis[] = new boolean[graph.length];
    //     Stack <Integer> s = new Stack<>();
    //     for(int i=0; i<graph.length; i++){
    //         if(!vis[i]){
    //             topSortUtil(graph , i , vis, s); // modified dfs
    //         }
    //     }

    //     while(!s.isEmpty()){
    //         System.out.print(s.pop()+ " ");
    //     }
    // }

    // public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack s) {
    //     vis [curr] = true;

    //     for(int i=0; i<graph[curr].size(); i++){
    //         Edge e= graph[curr].get(i);
    //         if(!vis[e.dest]) {
    //             topSortUtil(graph, e.dest, vis, s);
    //         }
    //     }
    //     s.push(curr);

    //}

    // using BFs approach
    public static void calcuIndegree(ArrayList<Edge> graph[] , int indeg[]){
        for(int i=0; i<graph.length; i++){
            int v = i;
            for(int j=0; j<graph[v].size(); j++) {
                Edge e= graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }
    public static void TopSort(ArrayList<Edge> graph[]){
        int indeg[] = new int[graph.length];
        calcuIndegree(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<indeg.length; i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }

        //BFS
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " "); //toplogical sort print
            
            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0 ){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
       // topSort(graph);
       TopSort(graph);
    }
}
