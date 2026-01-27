package Arrays;

//Moore's Voting Algorithm (also known as the Boyer-Moore Majority Vote Algorithm)
// is an efficient way to find the majority element in an array with O(n) and O(1).
// A majority element is defined as an element
// that appears more than n/2 times, where n is the size of the array.

//The algorithm works on the principle of cancellation. Since the majority element appears more than half the time, even
// if every other element "votes" against it, the majority
// element will still have at least one vote left over.

public class MooresVotingAlgorithm {
    public static int voting(int[] arr,int n){
        int mincount=1;
        int curr=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]!=curr){
                mincount--;
            }else{
                mincount++;
            }
            if(mincount<=0) curr=arr[i];
        }
        return curr;
    }
    public static void main(String[] args) {
        int[] arr={1, 1, 2, 1, 3, 5, 1};
        int n=arr.length;
        System.out.println(voting(arr,n));
    }
}
