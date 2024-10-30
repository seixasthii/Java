package toguro.exercicios_java;
import java.util.Scanner;
public class NPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos nºs quer testar: ");
        int n = sc.nextInt();
        int x, z;
        int v = 1;
        for (int i = 0; i < n; i++) {
            z = 0;
            System.out.println("Digite o "+v+"º numero");
            x = sc.nextInt();
            v++;
            for (int j = 2; j < x; j++) {
                if (x % j == 0) 
                    z++;
            }
            if (z == 0) 
                System.out.println(x+" eh primo\n");
             else 
                System.out.println(x+" nao eh primo\n");
        } 
    }
}
