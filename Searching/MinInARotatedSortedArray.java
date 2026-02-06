package Searching;

import java.util.*;

//Q->Given a sorted array of distinct elements arr[]
// of size n that is rotated at some unknown point, the task is to find the minimum element in it.

//We can optimize the minimum element searching by using Binary Search where we find the mid element
// and then decide whether to stop or to go to left half or right half:
//
//If arr[mid] > arr[high], it means arr[low ... mid] is sorted and we need to search in the right half.
// So we change low = mid + 1.
//If arr[mid] <= arr[high], it means arr[mid ... high] is sorted and we need to search in the left half.
// So we change high = mid. (Note: Current mid might be the minimum element).
//How do we terminate the search? One way could be to check if the mid is smaller than both of its adjacent,
// then we return mid. This would require a lot of condition checks like if adjacent indexes are valid or
// not and then comparing mid with both. We use an interesting fact here: If arr[low] < arr[high],
// then the current subarray is sorted, So we return arr[low].

public class MinInARotatedSortedArray {
    public static int findMin(int[] arr){
        int l=0,r=arr.length-1;
        while(l<r){
            if(arr[l]<arr[r]) return arr[l];
            int mid=l+(r-l)/2;
            if(arr[mid]>arr[r]){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return arr[l];
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        System.out.println(findMin(arr));
    }
}
