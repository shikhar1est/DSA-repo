package GreedyAlgorithm;

import java.util.*;

//Naive Approach - Recursion:
//Start from the first element and recursively call for all the elements reachable from the first element.
// The minimum number of jumps to reach end from first can be calculated using the minimum value from
// the recursive calls.
//
//minJumps(start, end) = 1 + Min(minJumps(k, end)) for all k reachable from start.

public class JumpGame1 {
//    public static int minRecursion(int i,int[] arr){
//        if(i>=arr.length-1) return 0;
//        int val=Integer.MAX_VALUE;
//        for(int j=i+1;j<=i+arr[i];j++){
//            int val1=minRecursion(j,arr);
//            if(val1!=Integer.MAX_VALUE) {
//                val = Math.min(val, 1 + val1);
//            }
//        }
//        return val;
//    }
//    public static int recursion(int[] arr,int n){
//         int ans=minRecursion(0,arr);
//         if(ans==Integer.MAX_VALUE) return -1;
//         return ans;
//    }


//Memoization:

//    public static int canJump(int[] nums) {
//        int n=nums.length;
//        int[] dp=new int[n+1];
//        Arrays.fill(dp,-1);
//        int ans=dynamic(0,nums,dp);
//        if(ans==Integer.MAX_VALUE) return -1;
//        return ans;
//    }
//    public static int dynamic(int i,int[] arr,int[] memo){
//        if(i>=arr.length-1) return 0;
//        if(memo[i]!=-1) return memo[i];
//        int ans=Integer.MAX_VALUE;
//        for(int j=i+1;j<=i+arr[i] && j<arr.length;j++){
//            int val=dynamic(j,arr,memo);
//            if(val!=Integer.MAX_VALUE){
//                ans=Math.min(ans,1+val);
//            }
//        }
//        return memo[i]=ans;
//    }

    //Can use Tabulation

    //using greedy Approach

    //The idea is to use greedy approach to find the minimum jumps needed to reach the end of an array.
    // We iterate through the array and maintain two values:
    // the maximum reachable index and the current reachable index and update them based on the array elements.
    public static void main(String[] args) {
        int[] arr={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int n=arr.length;
    }
}
