package BinarySearch;

//One of the most beautiful properties of standard Binary Search is that if the target is not found,
// the left pointer l will naturally end up pointing exactly at the index where the target should be inserted.

public class SearchInsertPosition {
    public static int searchinsert(int[] arr,int target){
        int n=arr.length;
        int l=0,r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                r=mid-1;
            }else {
                l = mid + 1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
         int[] nums={1,3,5,6};
         int target=7;
         System.out.println(searchinsert(nums,target));
    }
}
