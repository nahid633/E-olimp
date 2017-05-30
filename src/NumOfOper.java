
import java.util.Scanner;

/**
 *
 * @author Nahid
 */
public class NumOfOper {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int count=0;
         String oper  =sc.nextLine();
for(int i=1;i<oper.length();i++){
    if(oper.charAt(i)=='+'||oper.charAt(i)=='-'||oper.charAt(i)=='*'){
        count++;
    }
}
        System.out.println(count);
  }
}
