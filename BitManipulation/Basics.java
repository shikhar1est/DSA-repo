package BitManipulation;

import java.util.Collections;

public class Basics {
    public static void DecimalToBinary(int n){ //Decimal To Binary
        StringBuilder ans=new StringBuilder("");
        while(n>0){
            int rem=n%2;
            ans.append((char)(rem+'0'));
            n/=2;
        }
        ans.reverse();
        System.out.println(ans.toString());
    }
    public static void BinaryToDecimal(String s) {
        int ans=0;
        int power=0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                ans += Math.pow(2, power);
            }
            power++;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        BinaryToDecimal("1000");
    }
}
