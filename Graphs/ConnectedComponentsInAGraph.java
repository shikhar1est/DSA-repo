package Graphs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ConnectedComponentsInAGraph {
    public static ArrayList<ArrayList<Integer>> helper(int[][] edges,int v){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int n=edges.length;
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int a=edge[0];
            int b=edge[1];
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }
        boolean[] visited=new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i]){
                ArrayList<Integer> temp=new ArrayList<>();
                dfs(adjList,temp,v,visited,i);
                Collections.sort(temp);
                ans.add(temp);
            }
        }
        return ans;
    }
    public static void dfs(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> temp,int v,boolean[] visited,int index){
        visited[index]=true;
        temp.add(index);
        for(int num : list.get(index)){
            if(!visited[num]){
                dfs(list,temp,v,visited,num);
            }
        }
    }
    public static void main(String[] args) {
        int[][] edges={{0,1},{2,1},{3,4}};
        int v=5;
        ArrayList<ArrayList<Integer>> ans=helper(edges,v);
        for(int i=0;i<ans.size();i++){
            ArrayList<Integer> temp=ans.get(i);
            for(int j=0;j<temp.size();j++){
                System.out.print(temp.get(j)+" ");
            }
            System.out.println();
        }
    }
}
