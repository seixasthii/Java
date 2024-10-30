package toguro.exercicios_java;
import java.util.Scanner;
public class Area_Circulo {
    public static void main(String[] args) {
        double n, A, raio;
        Scanner nmb = new Scanner(System.in);
        n = 3.14159;
        raio =  nmb.nextDouble();
        A = n*(raio*raio);
        System.out.printf("A=%.4f\n",A);
    }
}
