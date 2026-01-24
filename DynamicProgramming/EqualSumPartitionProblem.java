package DynamicProgramming;

//Same as Subset sum with a couple of checks.

public class EqualSumPartitionProblem {
    public static void main(String[] args) {
        int[] arr={1,5,11,5};
        int n=arr.length;
        int sum=0;
        System.out.println(helper(arr,n));
    }
    public static boolean helper(int[] arr,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
    }
}
