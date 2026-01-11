package Graphs;

//The Bellman-Ford Algorithm is a single-source shortest
// path algorithm that finds the shortest distance from a starting node
// to all other nodes in a weighted graph.
//Unlike Dijkstra's algorithm, Bellman-Ford can
// handle graphs with negative edge weights. It is also famous for its ability to detect negative
// weight cycles—cycles where the sum of edge weights is less than zero
// , making a "shortest" path impossible because you could loop forever to keep decreasing the total cost.

//A negative weight cycle is a cycle in a graph, whose sum of edge weights is negative.
// If you traverse the cycle, the total weight accumulated would be less than zero.

//Relax all the edges V-1 times, sequentially.
//Here, Relaxation means : if(dist[u]+weight<dist[v]) dist[v]=dist[u]+weight;

//Q-> How to detect Negative cycle?
//On Nth iteration if the values still keep on decreasing or
//the distance array still gets updated then we know there's a negative cycle

//Don't use Integer.MAX_VALUE as adding "weight" to it will cause overflow.

import java.util.Arrays;

//The standard Bellman-Ford algorithm naturally handles a "limited edges" constraint because of how it iterates.
//In fact, while Dijkstra explores based on weight, Bellman-Ford explores based on "hop count" (number of edges).
public class BellmanFordAlgorithm {
    public static int[] BellmanFord(int src,int v,int[][] edges){
        int[] dist=new int[v];
        Arrays.fill(dist,(int)1e8);
        dist[src]=0;
        for(int i=0;i<v-1;i++){
            for(int[] edge: edges){
                int u=edge[0];
                int d=edge[1];
                int weight=edge[2];
                if(dist[u]!=1e8 && dist[u]+weight<dist[d]){
                    dist[d]=dist[u]+weight;
                }
            }
        }
        for(int[] edge : edges){ //Final loop to check if negative cycle exists
            if(dist[edge[0]]!=1e8 && dist[edge[0]]+edge[2]<dist[edge[1]]){
                return new int[]{-1};
            }
        }
        return dist;
    }
    public static void main(String[] args) {
         int v=5;
         int source=0;
        int[][] edges = new int[][] {
                {1, 3, 2},
                {4, 3, -1},
                {2, 4, 1},
                {1, 2, 1},
                {0, 1, 5}
        };
        int[] ans=BellmanFord(source,v,edges);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
