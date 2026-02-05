package DynamicProgramming;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String a="babad";
        int n=a.length();
        StringBuilder st=new StringBuilder(a);
        String b=st.reverse().toString();
        int ans=0;
        int[][] dp=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    ans=Math.max(ans,dp[i][j]);
                }else{
                    dp[i][j]=0;
                }
            }
        }
        System.out.println(dp[n][n]);
    }
}
