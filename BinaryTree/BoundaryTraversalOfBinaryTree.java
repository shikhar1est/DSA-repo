package BinaryTree;

public class BoundaryTraversalOfBinaryTree {
    public static void main(String[] args) {
     //Boundary Traversal--> 3 steps:
        //1: Move left, if not possible then move right until finding a leaf node
        //2: After step 1 ends, collect all leaf nodes in the tree
        //3: Inverse of step 1, we go right from the start but here we collect the items after reaching full depth

     //Vertical Traversal of Binary Tree::
        //Think of the tree on a coordinate grid where the root is at 0. Going left is -1, going right is +1.
        // Use BFS (Queue) to traverse level-by-level so nodes naturally order from top-to-bottom.
        // Throw nodes into a TreeMap using their horizontal distance as the key—this automatically
        // sorts your columns from left to right. Finally, just collect the map's values!

     //Last digit of a^b(POTD GFG 20-06-2026):
        //The last digit of any exponentiation repeats in cycles of 4. To solve this efficiently
        // for giant numbers, just find the last digit of base $a$ (a % 10) and find the exponent
        // $b \pmod 4$. If $b \pmod 4 == 0$, treat the exponent as $4$.
        // Finally, calculate $\text{base}^{\text{exponent}} \pmod{10}$ for your answer.

        //Top View using DFS (The Depth Check)
        //Unlike BFS, DFS doesn't visit nodes top-to-bottom. To get the Top View via DFS, traverse
        // using coordinates (hd, depth). Store the results in a TreeMap, but only overwrite an existing
        // hd column if the current node's depth is smaller (higher up) than what was stored before.

        //Bottom View of a Binary Tree (The Overwrite Rule)
        //Bottom View is the exact opposite of Top View. Using a BFS Queue and a TreeMap, track the
        // horizontal distance of each node. Instead of checking if a column is already filled, always
        // overwrite the map with the latest node's value. Since BFS naturally finishes at the bottom of the tree,
        // the final values left in your map will be the bottom-most nodes from left to right.

        //Construct a BT using Inorder & PreOrder:
        //To reconstruct a binary tree from Preorder and Inorder arrays, recognize that Preorder always hands you the
        // current root node first, while Inorder tells you exactly how to split the remaining elements into left
        // and right subtrees. To solve it efficiently, dump the Inorder array into a HashMap upfront for instantly
        // looking up where the root splits the tree (the pivot). Then, recursively build the tree by pulling the
        // next root from Preorder, finding its pivot index in the map, and splitting the boundaries: the lef
        // t subtree bounds become [left, pivot - 1] and the right subtree bounds become [pivot + 1, right].
        // Because Preorder reads structural data from left-to-right ($Root \rightarrow Left \rightarrow Right$),
        // you must build the left child recursively before building the right child so the pointer steps through
        // the array sequentially.

        //SERIALIZE & DESERIALIZE A BINARY TREE:
        //When serializing and deserializing a binary tree, your encoding and decoding strategies must mirror each
        // other completely. If you serialize using a Preorder DFS strategy, you cannot decode it using a Level-Order BFS
        // Queue loop. Furthermore, because tree values can be negative or contain multiple digits (e.g., -1000 to 1000),
        // casting integers directly to a single char breaks down instantly; you must use a string delimiter
        // like commas (,) and an explicit null marker (like #). Finally, in Java, strings are immutable, so passing
        // a String to a recursive method to append text does not modify the original variable—always use StringBuildeR
        // for accumulating values across recursive calls.
    }
}
