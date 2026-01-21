package DynamicProgramming;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr={3, 34, 4, 12, 5, 2};
        int target=9;
        int n=arr.length;
        Boolean[][] dp=new Boolean[n+1][target+1];
        System.out.println(SubsetMemoization(arr,target,n,dp));
    }
//    public static boolean SubsetRecursion(int[] arr,int target,int n){
//        if(target==0) return true;
//        if(n==0) return false;
//        if(arr[n-1]>target) return SubsetRecursion(arr,target,n-1);
//        return SubsetRecursion(arr,target-arr[n-1],n-1) || SubsetRecursion(arr,target,n-1);
//    }
    public static boolean SubsetMemoization(int[] arr,int sum,int n,Boolean[][] dp){
        if(sum==0) return true;
        if(n==0) return false;
        if(dp[n][sum]!=null) return dp[n][sum];
        if(arr[n-1]>sum) return dp[n][sum]=SubsetMemoization(arr,sum,n-1,dp);
        return dp[n][sum]=SubsetMemoization(arr,sum-arr[n-1],n-1,dp) || SubsetMemoization(arr,sum,n-1,dp);
    }
}
