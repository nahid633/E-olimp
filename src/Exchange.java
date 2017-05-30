import java.util.Scanner;

/**
 *
 * @author Nahid
 */
public class Exchange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test =sc.nextInt();
        for(int i =0;i<test;i++){
            int m =sc.nextInt();
            if(m%3==0) System.out.println("GCV");
            else if(m%3==1) System.out.println("VGC");  
            else System.out.println("CVG");
        }
    }
}