package BinarySearch;

public class LowerBound {
    public static int lowerbound(int[] arr,int target){
        int n=arr.length;
        int l=0,r=n-1,ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>=target){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int val=2;
        System.out.println(lowerbound(arr,val));
    }
}
