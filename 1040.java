import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();
        
        float media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;
        System.out.println("Media: " + String.format("%.1f", media));
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.printf("Aluno em exame.%n");
            float n5 = sc.nextFloat();
            System.out.println("Nota do exame: " + String.format("%.1f", n5));
            float mediaFinal = (media + n5) / 2;
            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", mediaFinal);
        }
        sc.close();
    }
}
