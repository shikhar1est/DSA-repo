package PrefixSum;

//TUF+ EXCLUSIVE

//the problem becomes:
//
//At which point do the maximum intervals overlap?
//
//This is NOT about grids.
//This is NOT about simulation.
//This is about interval overlap.

//This problem is an interval overlap question disguised as a lighting simulation.
// Each light forms an interval [pos - range, pos + range]. Instead of marking all covered points
// (which is impossible due to large range), use sweep line technique: add +1 at interval start and -1
// at interval end+1 in a sorted map, then compute prefix sum to track active intervals.
// The position where prefix sum is maximum is the brightest. Return smallest if tie.

//USE TREEMAP(HashMap which sorts by key values)
public class BrightestPositionOnStreet {
    public static void main(String[] args) {

    }
}
