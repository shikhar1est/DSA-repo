package DynamicProgramming;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr={3, 34, 4, 12, 5, 2};
        int target=9;
        int n=arr.length;
        Boolean[][] dp=new Boolean[n+1][target+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<target+1;j++){
                if(j==0) dp[i][j]=true;
                if(i==0 && j!=0) dp[i][j]=false;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<target+1;j++) {
                int curr = arr[i - 1];
                if (curr > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - curr];

                }
            }
        }
        System.out.println(dp[n][target]);
    }
    public static boolean SubsetRecursion(int[] arr,int target,int n){
        if(target==0) return true;
        if(n==0) return false;
        if(arr[n-1]>target) return SubsetRecursion(arr,target,n-1);
        return SubsetRecursion(arr,target-arr[n-1],n-1) || SubsetRecursion(arr,target,n-1);
    }
    public static boolean SubsetMemoization(int[] arr,int sum,int n,Boolean[][] dp){
        if(sum==0) return true;
        if(n==0) return false;
        if(dp[n][sum]!=null) return dp[n][sum];
        if(arr[n-1]>sum) return dp[n][sum]=SubsetMemoization(arr,sum,n-1,dp);
        return dp[n][sum]=SubsetMemoization(arr,sum-arr[n-1],n-1,dp) || SubsetMemoization(arr,sum,n-1,dp);
    }
}
