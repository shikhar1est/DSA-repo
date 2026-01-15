package DynamicProgramming;

public class KnapsackZeroOneRecursive {
    public static int knapsack(int[] value,int[] weight,int knap,int n){
        if(knap==0 || n==0) return 0;
        int pick=0;
        if(weight[n-1]<=knap){
            pick=value[n-1]+knapsack(value,weight,knap-weight[n-1],n-1);
        }
        int notpick=knapsack(value,weight,knap,n-1);
        return Math.max(pick,notpick);
    }
    public static void main(String[] args) {
        int[] val = {1, 2, 3};
        int[] wt = {4, 5, 1};
        int W = 4;
        System.out.println(knapsack(val,wt,W,val.length));
    }
}
