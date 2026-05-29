package SlidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharactrers {
    public static int slide(String s){
        int c=0;
        int n=s.length();
        HashSet<Character> set=new HashSet<>();
        int l=0,ans=0;
        for(int r=0;r<n;r++){
            char a=s.charAt(r);
            while(set.contains(a)){
                char temp=s.charAt(l);
                set.remove(temp);
                l++;
            }
            set.add(a);
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="abcddabac";
        System.out.println(slide(s));
    }
}
