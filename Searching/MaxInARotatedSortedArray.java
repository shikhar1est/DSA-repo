package Searching;

public class MaxInARotatedSortedArray {
    public static int findMax(int[] arr){
        int left=0,right=arr.length-1;
        while(left<right){
            if(arr[left]<arr[right]) return arr[right];
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[left]){
                left=mid;
            }else{
                right=mid-1;
            }
        }
        return arr[right];
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 10, 1, 2, 3, 4, 5};
        System.out.println(findMax(arr));
    }
}
