package BitManipulation;

public class AddBinary {
    public static void helper(String a,String b){
        int al=a.length()-1;
        int bl=b.length()-1;
        StringBuilder ans=new StringBuilder();
        int carry=0;
        while(al>=0 || bl>=0 || carry>0){
            int sum=carry;
            if(al>=0){
                sum+=a.charAt(al)-'0';
                al--;
            }
            if(bl>=0){
                sum+=b.charAt(bl)-'0';
                bl--;
            }
            ans.append(sum%2);
            carry=sum/2;
        }
        System.out.println(ans.reverse().toString());

    }
    public static void main(String[] args) {
        String a="1010";
        String b="1011";
        helper(a,b);
    }
}
