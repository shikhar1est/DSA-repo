package Graphs;

//The main idea is to reduce heights of trees representing different sets.
// We achieve this with two most common methods:
//1) Path Compression
//2) Union By Rank

//Path Compression (Used to improve find()):
//
 //Union by rank prevents bad trees.
//Path compression fixes them if they still happen.
//The idea is to flatten the tree when find() is called.
// When find() is called for an element x, root of the tree is returned.
// The find() operation traverses up from x to find root.
// The idea of path compression is to make the found root as parent of x so that we don’t have to
// traverse all intermediate nodes again. If x is root of a subtree,
// then path (to root) from all nodes under x also compresses.

//It speeds up the data structure by compressing the height of the trees.
// It can be achieved by inserting a small caching mechanism into the Find operation.


//Union By Rank(Modification to union())

//Union by Rank: the idea
//Always attach the shorter tree under the taller tree
//rank ≈ “height of the tree” (roughly)
//We keep trees shallow
//rank[]-> an estimate of how tall the tree rooted at x is
public class DSUoptimizationUnionByRank {
    public static void main(String[] args) {

    }
}
