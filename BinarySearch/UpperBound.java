package BinarySearch;

public class UpperBound {
    public static int upperbound(int[] arr,int target){
        int n=arr.length;
        int l=0,r=n-1;
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>target){
                r=mid-1;
            }else{
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int val=11;
        System.out.println(upperbound(arr,val));
    }
}
