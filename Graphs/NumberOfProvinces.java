package Graphs;

import java.util.ArrayList;
import java.util.*;

import static Graphs.BinaryMazeShortestDFS.dfs;

public class NumberOfProvinces {
    public static int isConnected(int[][] edges,int V){
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(edges[i][j]==1 && i!=j){
                    list.get(i).add(j);
                }
            }
        }
        int c=0;
        boolean[] visited=new boolean[V];
        Arrays.fill(visited,false);
        for(int i=0;i<V;i++){
            if(!visited[i]){
                c++;
                dfs(list,visited,V,i);
            }
        }
        return c;
    }
    public static void dfs(ArrayList<ArrayList<Integer>> ans,boolean[] visited,int n,int index){
        visited[index]=true;
        for(int st : ans.get(index)){
            if(!visited[st]){
                dfs(ans,visited,n,st);
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix={{1,1,0},{1,1,0},{0,0,1}};
        int V=3;
        System.out.println(isConnected(matrix,V));
    }
}
