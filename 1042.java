import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();  //entrada de dados
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3) { //condição para n1 ser o menor
            System.out.println(n1); 
            if (n2 < n3) { //condição para n2 ser o menor
                System.out.println(n2); 
                System.out.println(n3); 
            } else { //condição para n3 ser o menor
                System.out.println(n3); 
                System.out.println(n2); 
            }
        } else if (n2 < n1 && n2 < n3) {  //condição para n2 ser o menor
            System.out.println(n2);  
            if (n1 < n3) {  //condição para n1 ser o menor
                System.out.println(n1);
                System.out.println(n3);
            } else {  //condição para n3 ser o menor
                System.out.println(n3);
                System.out.println(n1);
            }
        } else {
            System.out.println(n3);  //condição para n3 ser o menor
            if (n1 < n2) {  //condição para n1 ser o menor
                System.out.println(n1);
                System.out.println(n2);
            } else { //condição para n2 ser o menor
                System.out.println(n2);
                System.out.println(n1);
            }
        }

        System.out.println();

        System.out.println(n1);  
        System.out.println(n2);
        System.out.println(n3);

        sc.close();
 
    }
 
}
