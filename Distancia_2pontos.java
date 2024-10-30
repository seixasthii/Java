package toguro.exercicios_java;
import java.util.Scanner;
public class Distancia_2pontos {
    public static void main(String[] args) {
        double y1, x1, y2, x2, sub1, sub2, soma, quad1, quad2, raiz;
        
        Scanner nmb = new Scanner(System.in);
        
        x1 = nmb.nextDouble();
        y1 = nmb.nextDouble();
        x2 = nmb.nextDouble();
        y2 = nmb.nextDouble();
        
        sub1 = x2 - x1;
        sub2 = y2 - y1;
        quad1 = sub1 * sub1;
        quad2 = sub2 * sub2;
        soma = quad1 + quad2;
        raiz = Math.sqrt(soma);
        
        System.out.printf("%.4f\n",raiz);
    }
}
