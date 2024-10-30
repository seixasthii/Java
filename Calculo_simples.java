package toguro.exercicios_java;
import java.util.Scanner;
public class Calculo_simples {
    public static void main(String[] args) {
        int A, B, A2, B2;
        float C, C2, CALC1, CALC2, VALOR;
        Scanner nmb = new Scanner(System.in);
        A = nmb.nextInt();
        B = nmb.nextInt();
        C = nmb.nextFloat();
        A2 = nmb.nextInt();
        B2 = nmb.nextInt();
        C2 = nmb.nextFloat();
        CALC1 = B*C;
        CALC2 = B2*C2;
        VALOR = CALC1 + CALC2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",VALOR);
    }
}
