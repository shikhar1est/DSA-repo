package Graphs;

public class FloodFill {
    public static int[][] helper(int[][] image,int sr,int sc,int newcolor){
        int startcolor=image[sr][sc];
        if(image[sr][sc]==newcolor) return image;
        return dfs(image,sr,sc,newcolor,startcolor);
    }
    public static int[][] dfs(int[][] image,int srow,int scol,int newColor,int startColor){
        if(!(srow>=0 && srow<image.length && scol>=0 && scol<image[0].length && image[srow][scol]==startColor)){
            return image;
        }
        image[srow][scol]=newColor;
        dfs(image,srow+1,scol,newColor,startColor);
        dfs(image,srow-1,scol,newColor,startColor);
        dfs(image,srow,scol+1,newColor,startColor);
        dfs(image,srow,scol-1,newColor,startColor);
        return image;
    }
    public static void main(String[] args) {
          int[][] image={{1,1,1,0},{0,1,1,1},{1,0,1,1}};
          int sr=1,sc=2;
          int newColor=2;
          int[][] newImage=helper(image,sr,sc,newColor);
          for(int i=0;i<newImage.length;i++){
              for(int j=0;j<newImage[0].length;j++){
                  System.out.print(newImage[i][j]+" ");
              }
              System.out.println();
          }
    }
}
