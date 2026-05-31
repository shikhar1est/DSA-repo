package Heap;

//To convert a Min-Heap (or any arbitrary array) into a Max-Heap, you use a bottom-up algorithm called Max-Heapify.
// Instead of inserting elements one by one into a new heap (which would take (n log n) time),
// you can transform the array completely in-place in (n) time.

//The Big Picture: What is "Heapify"?
//Think of maxHeapify as a "sink-down" operation.
//
//Its only job is to take a single parent element that might be violating the Max-Heap rule
// (because it's smaller than its children) and push it down the tree until it finds its rightful place.

public class ConvertMinHeapToMaxHeap {
    public static void maxHeapify(int i,int[] arr,int n){
        int p=i;
        int lc=2*i+1;
        int rc=2*i+2;
        if(lc<n && arr[lc]>arr[p]){
            p=lc;
        }
        if(rc<n && arr[rc]>arr[p]){
            p=rc;
        }
        if(i!=p){
            int temp=arr[i];
            arr[i]=arr[p];
            arr[p]=temp;
            maxHeapify(p,arr,n);
        }
    }
    public static int[] MinToMaxHeap(int n, int[] arr){
        // Write your code here
        for(int i=(n-2)/2;i>=0;i--){
            maxHeapify(i,arr,n);
        }
        return arr;
    }
    public static void main(String[] args) {
          int[] arr={1,2,3,6,7,8};
          int n=6;
          int[] ans=MinToMaxHeap(n,arr);
    }
}
