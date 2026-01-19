package DynamicProgramming;

//The problem this algorithm solves-> MAXIMUM SUBARRAY SUM
//Kadane reduces the complexity to O(N)
//CORE IDEA: At every step we have to ask the question:
//Is it better to extend the previous subarray OR to start a new subarray
//It contains 2 variables-> currentSum and mainSum
//currentSum->max subarray sum ending at current index
//mainSum->max subarray sum seen till now

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr={2, 3, -8, 7, -1, 2, 3};
        int n=arr.length;
        int currSum=Integer.MIN_VALUE;
        int totalSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            currSum=Math.max(arr[i],arr[i]+currSum);
            totalSum=Math.max(totalSum,currSum);
        }
        System.out.println("Answer:"+totalSum);
    }
}
