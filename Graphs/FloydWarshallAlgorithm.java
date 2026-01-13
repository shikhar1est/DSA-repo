package Graphs;

//What it solves?
//Find the shortest paths between every pair of vertices in a weighted graph.

//The Floyd–Warshall algorithm works by maintaining a two-dimensional array that represents the distances between
// nodes. Initially, this array is filled using only the direct edges between nodes. Then,
// the algorithm gradually updates these distances by checking if shorter paths
// exist through intermediate nodes.
//
//This algorithm works for both the directed and undirected weighted graphs and can handle
// graphs with both positive and negative weight edges.
//
//Note: It does not work for the graphs with negative cycles (where the sum of the edges in a cycle is negative).

//Main logic: “Either the best path from i → j already exists,
//OR going via k is better.”

//Why Floyd Warshall Works (Correctness Proof)?
//The algorithm relies on the principle of optimal substructure, meaning:
//
//->If the shortest path from i to j passes through some vertex k, then the path from i to k and the
// path from k to j must also be shortest paths.
//->The iterative approach ensures that by the time vertex k is considered,
// all shortest paths using only vertices 0 to k-1 have already been computed.
//->By the end of the algorithm, all shortest paths are computed optimally because each possible
// intermediate vertex has been considered.

//Why Floyd-Warshall Algorithm better for Dense Graphs and not for Sparse Graphs?
//
 //Dense Graph: A graph in which the number of edges are significantly much higher than the number of vertices.
//Sparse Graph: A graph in which the number of edges are very much low.
//
//No matter how many edges are there in the graph the Floyd Warshall Algorithm runs for O(V3)
// times therefore it is best suited for Dense graphs.
// In the case of sparse graphs, Johnson's Algorithm is more suitable.
public class FloydWarshallAlgorithm {
    public static int[][] FWarshall(int[][] dist){
        int l=dist.length;
        for(int k=0;k<l;k++){
            for(int i=0;i<l;i++){
                for(int j=0;j<l;j++){
                    if(dist[i][k]!=1e8 && dist[k][j]!=1e8){
                        dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                    }
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
      int INF= (int) 1e8;
        int[][] dist = { { 0, 4, INF, 5, INF },
                { INF, 0, 1, INF, 6 },
                { 2, INF, 0, 3, INF },
                { INF, INF, 1, 0, 2 },
                { 1, INF, INF, 4, 0 } };
        FWarshall(dist);
        for(int i=0;i< dist.length;i++){
            for(int j=0;j< dist.length;j++){
                System.out.print(dist[i][j]+" ");
            }
            System.out.println();
        }
    }
}
