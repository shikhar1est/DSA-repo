package SlidingWindow;

public class MaxConsecutiveOnes3 {
    public static int slide(int[] nums,int k){
        int l=0,n=nums.length,zero=0;
        int ans=0;
        for(int r=0;r<n;r++){
            if(nums[r]==0) zero++;
            while(zero>k){
                if(nums[l]==0) zero--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k=3;
        System.out.println(slide(nums,k));
    }
}
