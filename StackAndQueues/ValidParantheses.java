package StackAndQueues;

import java.util.Stack;

public class ValidParantheses {
    static boolean helper(String s){
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i!=s.length()){
            char a=s.charAt(i);
            if(a=='(' || a=='[' || a=='{'){
                st.push(a);
            }else{
                if(st.isEmpty()) return false;
                char temp=st.peek();
                if((temp=='(' && a==')') || (temp=='[' && a==']') || (temp=='{' && a=='}')){
                    st.pop();
                }else{
                    return false;
                }
            }
            i++;
        }
        return st.isEmpty();
    }
    static void main() {
        String s="([)]";
        System.out.println(helper(s));
    }
}
