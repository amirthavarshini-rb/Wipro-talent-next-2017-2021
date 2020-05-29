import java.util.Scanner;
public class prog3{

    public static void main(String[] args) {
        int arr[]={4,3,7,10,15,10};
        Scanner s = new Scanner(System.in);
        int search = s.nextInt();
        int f=0;
        for(int  i=0;i<arr.length;i++) {
            if (arr[i]==search) {
                System.out.println(i);
                f = 1;
                break;
            }
        }
        if(f==0){
            System.out.println(-1);
        }
    }
}
