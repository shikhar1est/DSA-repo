package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {

    public static ArrayList<Integer> djikstra(ArrayList<ArrayList<int[]>> adj, int src) {
        int V = adj.size();

        // {distance, node}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]); //this int[] represents (distance,node)

        int[] distance = new int[V];
        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[src] = 0;
        pq.add(new int[]{0, src});

        while (!pq.isEmpty()) {
            int[] temp = pq.poll();
            int dist = temp[0];
            int node = temp[1];

            // Ignore stale entries(if the poll'd distance is bigger than the existing one then why would we use it?)
            if (dist > distance[node]) continue;

            for (int[] edge : adj.get(node)) { //this int[] represents (destination,weight)
                int neighbor = edge[0];
                int weight = edge[1];

                if (distance[neighbor] > dist + weight) {
                    distance[neighbor] = dist + weight;
                    pq.add(new int[]{distance[neighbor], neighbor});
                }
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int d : distance) result.add(d);
        return result;
    }

    public static void addEdge(ArrayList<ArrayList<int[]>> adj, int u, int v, int w) {
        adj.get(u).add(new int[]{v, w});
        adj.get(v).add(new int[]{u, w}); // undirected
    }

    public static void main(String[] args) {
        int v = 5;
        int src = 0;

        ArrayList<ArrayList<int[]>> adjList = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList, 0, 1, 4);
        addEdge(adjList, 0, 2, 8);
        addEdge(adjList, 1, 4, 6);
        addEdge(adjList, 1, 2, 3);
        addEdge(adjList, 2, 3, 2);
        addEdge(adjList, 3, 4, 10);

        ArrayList<Integer> ans = djikstra(adjList, src);
        System.out.println(ans);
    }
}
