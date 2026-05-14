package BitManipulation;

public class SingleNumber {
    public static int helper(int[] nums){
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
       int[] arr={1,2,2,1,3,5,5};
       System.out.println(helper(arr));
    }
}
