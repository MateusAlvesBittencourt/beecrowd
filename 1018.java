//* Notas */
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int notas100 = valor / 100;
        int notas50 = (valor % 100) / 50;
        int notas20 = ((valor % 100) % 50) / 20;
        int notas10 = (((valor % 100) % 50) % 20) / 10;
        int notas5 = ((((valor % 100) % 50) % 20) % 10) / 5;
        int notas2 = (((((valor % 100) % 50) % 20) % 10) % 5) / 2;
        int notas1 = ((((((valor % 100) % 50) % 20) % 10) % 5) % 2) / 1;
        System.out.println(valor);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
        sc.close();
    }
}
