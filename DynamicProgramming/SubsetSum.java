package DynamicProgramming;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr={3, 34, 4, 12, 5, 2};
        int target=9;
        int n=arr.length;
        System.out.println(SubsetRecursion(arr,target,n));
    }
    public static boolean SubsetRecursion(int[] arr,int target,int n){
        if(target==0) return true;
        if(n==0) return false;
        if(arr[n-1]>target) return SubsetRecursion(arr,target,n-1);
        return SubsetRecursion(arr,target-arr[n-1],n-1) || SubsetRecursion(arr,target,n-1);
    }
}
