package DynamicProgramming;

//Leetcode-2498
//Think of the forward and return journeys as partitioning the intermediate stones—every stone can belong to
// only one path because revisiting is forbidden. If one path uses consecutive stones, the other path is forced
// to make a much larger jump later. To balance the largest jump on both trips, the optimal strategy is to alternate
// stones between the two paths (even indices on one trip, odd indices on the other). Once you see this
// alternating pattern, the maximum jump is simply the largest distance between stones two indices apart,
// i.e., max(stones[i] - stones[i-2]), with the first adjacent jump handled separately.

public class FrogJump2 {
    public static void main(String[] args) {

    }
}
