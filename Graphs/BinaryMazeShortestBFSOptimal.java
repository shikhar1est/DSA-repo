package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryMazeShortestBFSOptimal {
    static class Node{
        int x,y,dist;
        Node(int x,int y,int dist){
            this.x=x;
            this.y=y;
            this.dist=dist;
        }
    }
   public static int shortestDistance(int N, int M, int grid[][], int X, int Y) {
        // code here
        if(grid[0][0]==0 || grid[X][Y]==0) return -1;
        if(X==0 && Y==0) return 0;

        boolean[][] visited=new boolean[N][M];
        Queue<Node> q=new LinkedList<>();
        q.add(new Node(0,0,0));
        visited[0][0]=true;
        while(!q.isEmpty()){
            Node temp=q.poll();
            if(temp.x==X && temp.y==Y) return temp.dist;
            int[][] directions={{-1,0},{1,0},{0,1},{0,-1}};
            for(int i=0;i<4;i++){
                int nrow=temp.x+directions[i][0];
                int ncol=temp.y+directions[i][1];
                if(nrow>=0 && nrow<N && ncol>=0 && ncol<M && !visited[nrow][ncol]
                        && grid[nrow][ncol]==1){
                    visited[nrow][ncol]=true;
                    q.add(new Node(nrow,ncol,temp.dist+1));
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] mat = new int[][] {
                { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
                { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
                { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                { 1, 1, 0, 0, 0, 0, 1, 0, 1, 1 }
        };
        int x=8,y=8;
        int row= mat.length;
        int col=mat[0].length;
        System.out.println(shortestDistance(row,col,mat,x,y));
    }
}
//bfs
