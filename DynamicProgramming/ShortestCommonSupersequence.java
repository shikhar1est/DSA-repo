package DynamicProgramming;

//DP-31

public class ShortestCommonSupersequence {
    public static int SCS(String a,String b){
        int n=a.length();
        int m=b.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0) dp[i][j]=0;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return n+m-dp[n][m];
    }
    public static void main(String[] args) {
         String a="abac";
         String b="cab";
         System.out.println(SCS(a,b));
    }
}
