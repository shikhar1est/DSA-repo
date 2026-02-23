package PrefixSum;

//Can just be solved using totalSum

public class findMiddleIndex {
    public static int solution(int[] arr){
        int n=arr.length;
        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=arr[i];
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            int rightSum=totalSum-leftSum-arr[i];
            if(leftSum==rightSum) return i;
            leftSum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,3,-1,8,4};
        System.out.println(solution(arr));
    }
}
