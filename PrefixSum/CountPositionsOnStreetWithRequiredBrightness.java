package PrefixSum;

//DON'T USE TREEMAP HERE

//This problem is a range-update problem. Each light forms an inclusive interval [pos-range, pos+range].
// Instead of updating every position inside the interval (which would be O(n²)), we use a difference array.
// For each interval, we do diff[start]++ and diff[end+1]--. Then we take a prefix sum across 0 to n-1
// to reconstruct actual brightness at each position. While computing the prefix sum, we compare brightness
// with requirement[i] and count valid positions. Time complexity is O(n + lights), space complexity is O(n).

public class CountPositionsOnStreetWithRequiredBrightness {
    public static void main(String[] args) {

    }
}
