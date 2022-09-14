import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner(System.in);
       
       int x = sc.nextInt();
       int y = sc.nextInt();
       
         if (x % y == 0 || y % x == 0) {
              System.out.println("Sao Multiplos");
         } else {
              System.out.println("Nao sao Multiplos");
         }

         sc.close();
    }
}
