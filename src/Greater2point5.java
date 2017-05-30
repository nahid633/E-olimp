//70% passed
import java.util.Scanner;


/**
 *
 * @author Nahid
 */
public class Greater2point5 {
          public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int test= sc.nextInt();
         float arr[]= new float[test];
         for(int i=0;i<test;i++){
             arr[i]=sc.nextFloat();
         if(arr[i]<=2.5) {
         System.out.print(i+1+" "); 
        System.out.printf("%.2f", arr[i]);
         break;
         }
         if(i==test)  System.out.println("Not Found");
         }
             
         
}
}