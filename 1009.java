//* Salario e bonus */
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();
        double bonus = vendas * 0.15;

        System.out.println("TOTAL = R$ " + String.format("%.2f", salario + bonus));

        sc.close();
    }
}
