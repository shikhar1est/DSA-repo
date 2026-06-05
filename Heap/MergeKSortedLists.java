package Heap;

import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        next=null;
    }
    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
}

public class MergeKSortedLists {
    public static Node listToLL(ArrayList<Integer> list){
        Node temp=new Node(-1,null);
        Node dummy=temp;
        for(int i=0;i<list.size();i++){
            dummy.next=new Node(list.get(i),null);
            dummy=dummy.next;
        }
        return temp.next;
    }
    public static Node mergedLL(ArrayList<Node> list) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Node temp = list.get(i);
            while (temp != null) {
                ans.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(ans);
        return listToLL(ans);

    }
    static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            // Print the data of the current node
            System.out.print(temp.val + " ");
            // Move to the next node
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Node head1=new Node(1,new Node(2,new Node(3)));
       Node head2=new Node(4);
       Node head3=new Node(2,new Node(9,new Node(15)));
       Node head4=new Node(17,new Node(30));
       ArrayList<Node> list=new ArrayList<>();
       list.add(head1);
       list.add(head2);
       list.add(head3);
       list.add(head4);
       Node mergedList=mergedLL(list);
       printLL(mergedList);
    }
}
