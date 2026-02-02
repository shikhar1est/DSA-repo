package DynamicProgramming;
import java.util.*;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String a="abcrjwl";
        String b="acwlxy";
        int n=a.length();
        int m=b.length();
        int[][] dp=new int[n+1][m+1];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
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
        System.out.println(dp[n][m]);
    }
//    public static int helper(String a,String b,int n,int m,int[][] dp){
//        if(n==0 || m==0) return 0;
//        if(dp[n][m]!=-1) return dp[n][m];
//        if(a.charAt(n-1)==b.charAt(m-1)){
//            return dp[n][m]=1+helper(a,b,n-1,m-1,dp);
//        }else {
//            return dp[n][m]=Math.max(helper(a, b, n - 1, m,dp), helper(a, b, n, m - 1,dp));
//        }
//    }
}
