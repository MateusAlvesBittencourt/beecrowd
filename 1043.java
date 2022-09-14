import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        if (A < B + C && B < A + C && C < A + B) {
            System.out.println("Perimetro = " + (A + B + C));
        } else {
            System.out.println("Area = " + ((A + B) * C / 2));
        }
        
        sc.close();
 
    }
 
}
