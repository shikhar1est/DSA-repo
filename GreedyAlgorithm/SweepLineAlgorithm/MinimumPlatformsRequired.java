package GreedyAlgorithm.SweepLineAlgorithm;

//The Sweep-line Algorithm is a powerful technique used primarily in computational geometry to solve
// problems involving geometric objects like points, lines, and polygons.Instead of checking every object
// against every other object (which is usually $O(n^2)$), the algorithm imagines a vertical or horizontal
// line "sweeping" across the plane. As the line moves, it stops only at specific event points
// (like the start or end of a line segment), allowing you to focus only on objects
// currently intersecting the line.

//Core ComponentsThe Sweep Line:
// An imaginary line (usually vertical, x = c)
// that moves across the plane.
// Event Queue: A sorted list of $x$-coordinates where the state of the sweep line changes
// (e.g., the endpoints of segments).
//
// Status Structure: A data structure (often a balanced BST) that keeps track of which objects currently
// intersect the sweep line, ordered by their $y$-coordinates.Example: Line Segment Intersection
// (Bentley-Ottmann)If you want to find all intersections among $n$ line segments:
// Naive Approach: Check every pair. Complexity: $O(n^2)$.Sweep-line Approach: *
// Sort endpoints by $x$.As the line hits a "start" point, add the segment to the Status Structure.
// As it hits an "end" point, remove it.The Magic: You only check for intersections between segments
// that are neighbors in the Status Structure (vertically adjacent).Complexity: $O((n + k) \log n)$,
// where $k$ is the number of intersections.

//**Minimum Platforms Required

//NAIVE SOLUTION : Using Two Nested Loops - O(n2) time and O(1) space

//The idea is to iterate through each train and for that train, check how many other
// trains have overlapping timings with it - where current train's arrival time falls
// between the other train's arrival and departure times. We keep track of this count for each train and
// continuously update our answer with the maximum count found.


public class MinimumPlatformsRequired {
    //NAIVE SOLUTION:
//    public static int minPlatform(int[] arr,int[] dep){
//        int ans=0;
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            int temp=1;
//            for(int j=0;j<n;j++){
//                if(i!=j){
//                    if(arr[j]<=arr[i] && dep[j]>=arr[i]){
//                        temp++;
//                    }
//                }
//            }
//            ans=Math.max(ans,temp);
//        }
//        return ans;
//    }

    //[Expected Approach] Using Sorting and Two Pointers - O(n log(n)) Time and O(n) Space

    //
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
    }
}
