package DynamicProgramming;

import java.util.Arrays;

public class KnapsackZeroOneMemoization {
    public static int knapsack(int[] value,int[] weight,int knap,int n,int[][] dp){
        if(knap==0 || n==0) return 0;
        if(dp[n][knap]!=-1) return dp[n][knap];
        int pick=0;
        if(weight[n-1]<=knap){
            pick=value[n-1]+knapsack(value,weight,knap-weight[n-1],n-1,dp);
        }
        int notpick=knapsack(value,weight,knap,n-1,dp);
        return dp[n][knap]=Math.max(pick,notpick);
    }
    public static void main(String[] args) {
        int[] val = {1, 2, 3};
        int[] wt = {4, 5, 1};
        int W = 4;
        int[][] dp=new int[val.length+1][W+1];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
        System.out.println(knapsack(val,wt,W,val.length,dp));
    }
}
