package Graphs;

import java.util.*;

public class Question_01Matrix {
    public static int[][] helper01(int[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        int[][] ans=new int[n][m];
        for(int[] ans1 : ans){
            Arrays.fill(ans1,Integer.MAX_VALUE);
        }
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    ans[i][j]=0;
                    q.add(new int[]{i,j});
                }
            }
        }
        int[][] direction={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int l=q.size();
            for(int i=0;i<l;i++){
                int[] curr=q.poll();
                int row=curr[0];
                int col=curr[1];
                for(int j=0;j<4;j++){
                    int nr=row+direction[j][0];
                    int nc=col+direction[j][1];
                    if(nr>=0 && nr<n && nc>=0 && nc<m && ans[nr][nc]==Integer.MAX_VALUE){
                        ans[nr][nc]=1+ans[row][col];
                        q.add(new int[]{nr,nc});
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] grid={{0,1,1,0},{1,1,0,0},{0,0,1,1}};
        int[][] ans=helper01(grid);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
