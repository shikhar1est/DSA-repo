package DynamicProgramming;

//APPROACH-1(DYNAMIC PROGRAMMING)

//The idea is to use Dynamic Programming to store the status of smaller substrings
// and use these results to check if a longer substring forms a palindrome.
//
//The main idea behind the approach is that if we know the status (i.e., palindrome or not)
// of the substring ranging [i, j], we can find the status of the substring ranging [i-1, j+1]
// by only matching the character str[i-1] and str[j+1].
//If the substring from i to j is not a palindrome, then the substring from i-1 to j+1
// will also not be a palindrome. Otherwise, it will be a palindrome only if str[i-1] and str[j+1]
// are the same.
//Base on this fact, we can create a 2D table (say table[][] which stores status of substring str[i . . . j] )
// , and check for substrings with length from 1 to n. For each length find all
// the substrings starting from each character i and find if it is a palindrome or not
// using the above idea. The longest length for which a palindrome formed will be the required answer.



//OR IT CAN BE SOLVED USING SIMPLE LOOP AND EXPANSION FROM THE CENTER(MANACHER'S ALGORITHM)

public class LongestPalindromicSubstring {
    public static String longpalindrome(String s){
         if(s.length()<2) return s;
         int start=0,end=0;
         for(int i=0;i<s.length();i++){
             int odd=expand(s,i,i);
             int even=expand(s,i,i+1);
             int len=Math.max(odd,even);
             if(len>start-end+1) {
                 start = i - (len - 1) / 2;
                 end = i + len / 2;
             }
         }
        return s.substring(start,end+1);
    }
    public static int expand(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l+1;
    }
    public static void main(String[] args) {
         String s="forgeeksskeegfor";
         System.out.println(longpalindrome(s));
    }
}
