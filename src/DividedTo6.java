import java.util.Scanner;


/**
 *
 * @author Nahid
 */
public class DividedTo6 {
              public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int test = sc.nextInt();
         int count =0;
         int sum=0;
         int arr[] = new int[test];
         for(int i=0;i<test;i++){
             arr[i] = sc.nextInt();
             if(arr[i]%6==0&&arr[i]!=0&&arr[i]>0){
                 count++;
             sum+=arr[i];
             }
         }
          System.out.println(count+" "+sum);
}
}