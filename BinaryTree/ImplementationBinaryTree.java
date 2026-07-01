package BinaryTree;

import java.util.*;

public class ImplementationBinaryTree {
    static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
            left=right=null;
        }
    }
    public static void main(String[] args) {
        Node first=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);
    }
}
