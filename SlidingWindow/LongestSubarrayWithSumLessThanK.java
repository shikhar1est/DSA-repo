package SlidingWindow;
import java.util.*;
public class LongestSubarrayWithSumLessThanK {
    public static int helper(int[] arr,int k){
        int n=arr.length;
        int l=0,r=0;
        int sum=0,maxlen=0;
        for(int i=r;i<n;i++){
            sum+=arr[i];
            while(sum>k){
                sum-=arr[l];
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
    public static void main() {
        int[] arr = {2, 5, 1, 7, 10};
        int K = 14;
        System.out.println(helper(arr,K));
    }
}
