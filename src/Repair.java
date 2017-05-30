
import java.util.Scanner;
/**
 *
 * @author Nahid
 */
public class Repair {
                
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test =sc.nextInt();
        for(int i =0;i<test;i++){
         int L =sc.nextInt();
            int W =sc.nextInt();
            int H =sc.nextInt();
            double res = (2*L*H+2*W*H)/16.0;
            if(res ==((int)res)) System.out.println((int)res);
            else System.out.println((int)res+1);
        }
     }
}
