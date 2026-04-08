package StackAndQueues;

class stack{
    int[] arr;
    int capacity;
    int top;
    public stack(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        top=-1;
    }
    public void push(int num){
        if(top==capacity-1){
            System.out.println("Stack overflow");
            return;
        }
        arr[++top]=num;
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack Empty");
            return -1;
        }
        return arr[top--];
    }
    public int top(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

}

public class ImplementStackUsingArray {
    static void main() {
         stack st=new stack(5);
         st.push(2);
         st.push(3);
         st.push(5);
         st.push(10);
         System.out.println(st.pop());
        System.out.println(st.top());
        System.out.println(st.isEmpty());
    }
}
