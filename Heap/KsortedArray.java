package Heap;

//The "K-Sorted Array" problem (also frequently called "Nearly Sorted Array") asks you to sort an
// array where each element is at most $k$ positions away from its target position in the final sorted array.
//
// For example, if an element should be at index 3 in the sorted array,
// it could currently be anywhere between index 3 - k and 3 + k in the given array.
//
// While standard sorting algorithms like Quicksort or Mergesort take $\mathcal{O}(n \log n)$ time, you can exploit this
// "nearly sorted" property to solve it much faster in $\mathcal{O}(n \log k)$ time using a Min-Heap.

//The Strategy:
// A Sliding Window Heap Because any element is at most k positions away from its correct spot,
// the absolute smallest element in the entire array must reside somewhere within the first (k + 1) elements
// (from index 0 to k).If we put those first $k + 1$ elements into a Min-Heap, the top of the heap is guaranteed
// to be the smallest element of the entire array.
// We can place it at index 0, pop it from the heap, and then slide our window forward by adding the next element
// from the array into the heap.Step-by-Step Algorithm
// Create a Min-Heap and insert the first $k + 1$
// elements of the array into it.
// Prepare a variable index = 0 to track where the next smallest element should go.
// Loop through the remaining elements of the array (from index k + 1 to n - 1):
// Extract the minimum element from the heap (pq.poll()) and place it at arr[index].
// Increment index.Add the current array element to the heap.Once you run out of new elements in the array,
// the heap will still contain $k$ elements. Put them one by one into the remaining positions of the array.

public class KsortedArray {
}
