//* Combustivel Gasto */
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();
        double distancia = tempo * velocidade;
        double litros = distancia / 12;
        System.out.println(String.format("%.3f", litros));
        sc.close(); 
    }
}
