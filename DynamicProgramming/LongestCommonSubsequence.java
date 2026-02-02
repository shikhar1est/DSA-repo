package DynamicProgramming;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String a="abcrjwl";
        String b="acwlxy";
        int n=a.length();
        int m=b.length();
        int ans=helper(a,b,n,m);
        System.out.println(ans);
    }
    public static int helper(String a,String b,int n,int m){
        if(n==0 || m==0) return 0;
        if(a.charAt(n-1)==b.charAt(m-1)){
            return 1+helper(a,b,n-1,m-1);
        }else {
            return Math.max(helper(a, b, n - 1, m), helper(a, b, n, m - 1));
        }
    }
}
