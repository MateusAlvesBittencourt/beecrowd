//* Consumo */

import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int x = input.nextInt();
        double y = input.nextDouble();
        double media = x / y;
        System.out.printf("%.3f km/l%n", media);
        input.close();
    }
}
