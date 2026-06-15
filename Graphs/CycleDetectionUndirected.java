package Graphs;

//Approach 1: DFS O(V+E)->TC and O(V) space
//To avoid this issue, we keep track of the parent node — the node from which we reached the current node in DFS.
// When we move from u to v, we mark u as the parent of v. Now, while checking the neighbors of v,
// If a neighbor is not visited, we continue DFS for that node.If a neighbor is already visited and
// not equal to the parent, it means there’s another path that leads back to this node — and hence, a cycle exists.

//Approach 2: BFS O(V+E)-> TC and O(V) space
//To

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class CycleDetectionUndirected {
    public static boolean helper(int u, ArrayList<ArrayList<Integer>> list,Boolean[] visited,int parent){
        visited[u]=true;
        for(int neighbor : list.get(u)){
            if(!visited[neighbor]){
                if(helper(neighbor,list,visited,u)){
                    return true;
                }
            }else if(neighbor!=parent){
                return true;
            }
        }
        return false;
    }
    public static boolean isCycleAdjDFS(ArrayList<ArrayList<Integer>> list){
        int v=list.size();
        Boolean[] visited=new Boolean[v];
        Arrays.fill(visited,false);
        for(int i=0;i<v;i++){
            if(!visited[i]){
                if(helper(i,list,visited,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> list,int u,int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }
    public static void main(String[] args) {
         int v=4;
         ArrayList<ArrayList<Integer>> list=new ArrayList<>();
         for(int i=0;i<v;i++){
             list.add(new ArrayList<>());
         }
         addEdge(list,0,1);
         addEdge(list,0,2);
         addEdge(list,1,2);
         addEdge(list,2,3);
         System.out.println((isCycleAdjDFS(list)?"True":"False"));
    }
}
