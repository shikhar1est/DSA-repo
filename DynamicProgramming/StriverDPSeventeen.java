package DynamicProgramming;

//Count number of subsets with sum equal to K value

//Take note of the base case

public class StriverDPSeventeen {
    public static void main(String[] args) {
         int[] arr={1,2,3,3};
         int n=arr.length;
         int k=6;
         System.out.println(recursion(arr,k,n));

    }
    public static int recursion(int[] arr,int k,int n){
        if(n==0){
            return k==0?1:0;
        }
        int pick=0;
        if(arr[n-1]<=k){
            pick=recursion(arr,k-arr[n-1],n-1);
        }
        int notpick=recursion(arr,k,n-1);
        return pick+notpick;
    }
}
