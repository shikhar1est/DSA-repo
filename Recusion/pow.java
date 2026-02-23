package Recusion;

public class pow {
    public static double recusion(double a,int b){
        if(b==0) return 1;
        if(b<0) return 1/recusion(a,-b);
        return a*recusion(a,b-1);
    }
    public static void main(String[] args) {
        double a=5.0;
        int b=4;
        System.out.println(recusion(a,b));
    }
}
