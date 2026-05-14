package Arrays;

public class PrintAllSubarrays {
    public static void main(String[] args) {
        int[] arr={10,20,30};
        for(int i=0;i<3;i++){
            for(int j=i;j<3;j++){
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}
