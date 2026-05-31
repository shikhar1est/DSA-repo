package Heap;

public class CheckIfArrayIsMaxHeap {
    public static boolean isMaxHeap(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<=(n-2)/2;i++){
            int p=arr[i];
            int c1=arr[2*i+1];
            if(2*i+1<n && p<c1) return false;
            if(2*i+2<n && p<arr[2*i+2]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={90, 15, 10, 7, 12, 2};
        System.out.println(isMaxHeap(arr));
    }
}
