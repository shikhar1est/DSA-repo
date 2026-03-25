package POTD;

//Frequency, not Generation: For "start and end with same letter," don't build the strings. Just count how many times each letter appears. If 'x' appears $n$ times, it creates $\frac{n(n+1)}{2}$ valid substrings. This turns a complex recursion problem into a simple $O(n)$ counting problem.

public class CountSubstringsWithSameFirstAndLastLetter {
    public static void main(String[] args) {
        String s="abcba";
        System.out.println(generate(s));
    }
    public static long generate(String s){
        int n=s.length();
        long[] arr=new long[26];
        for(int i=0;i<n;i++){
            char a=s.charAt(i);
            arr[a-'a']++;
        }
        long ans=0;
        for(int i=0;i<26;i++){
            ans+=(arr[i]/2)*(arr[i]+1);
        }
        return ans;
    }
}
