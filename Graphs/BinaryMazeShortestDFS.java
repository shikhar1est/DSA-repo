package Graphs;

public class BinaryMazeShortestDFS {
    static int minDist=Integer.MAX_VALUE;
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
        System.out.println(ShortestPath(mat,x,y));
    }
    public static int ShortestPath(int[][] grid,int x,int y){
        if(grid[x][y]==0 || grid[0][0]==0) return -1;
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        minDist = Integer.MAX_VALUE;
          dfs(grid,0,0,x,y,0,visited);
        return (minDist == Integer.MAX_VALUE) ? -1 : minDist;
    }
    public static void dfs(int[][] grid,int x1,int y1,int x2,int y2,int c,boolean[][] visited){
        //Boundary Check
        if(x1<0 || x1>=grid.length || y1<0 || y1>=grid[0].length || visited[x1][y1] || grid[x1][y1]==0) return;

        if (c >= minDist) return;

        if(x1==x2 && y1==y2){
            minDist=Math.min(minDist,c);
            return;
        }
        visited[x1][y1]=true;
        dfs(grid,x1+1,y1,x2,y2,c+1,visited);
        dfs(grid,x1-1,y1,x2,y2,c+1,visited);
        dfs(grid,x1,y1+1,x2,y2,c+1,visited);
        dfs(grid,x1,y1-1,x2,y2,c+1,visited);

        visited[x1][y1]=false;
    }
}
