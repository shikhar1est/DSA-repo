package GreedyAlgorithm;

import java.util.*;

public class AssignCookies {
    public static int assigncookies(int[] g,int[] s){
        int gl=g.length;
        int sl=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0,c=0;
        while(i!=gl && j!=sl){
            if(g[i]<=s[j]){
                i++;
                c++;
            }
            j++;
        }
        return c;
    }
    public static void main(String[] args) {
      int[] g={1,2};
      int[] s={1,2,3};
      System.out.println(assigncookies(g,s));
    }
}
