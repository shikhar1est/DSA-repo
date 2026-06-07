package BinarySearch;

public class SearchAnElement {
    public static boolean bsearch(int[] arr,int target){
        int n=arr.length;
        int l=0,r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int val=2;
        System.out.println(bsearch(arr,val));
    }
}
