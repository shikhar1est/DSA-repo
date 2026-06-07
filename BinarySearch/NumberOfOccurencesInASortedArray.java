package BinarySearch;

public class NumberOfOccurencesInASortedArray {
    public static int numberofoccure(int[] arr,int target){
        int n=arr.length;
        int l=0,r=n-1,first=-1,last=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                first=mid;
                r=mid-1;
            }else if(arr[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        l=0;
        r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                last=mid;
                l=mid+1;
            }else if(arr[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return last-first+1;
    }
    public static void main(String[] args) {
        int[] arr={1, 1, 2, 2, 2, 2, 3};
        int target=3;
        System.out.println(numberofoccure(arr,target));
    }
}
