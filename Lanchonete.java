package toguro.exercicios_java;
import java.util.Scanner;
public class Lanchonete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L,Q;
        double a,b,c,d,e;
        System.out.println("Selecione seu item desejado: ");
        System.out.println("CÓDIGO     ESPECIFICAÇÃO         PREÇO\n" +
"1          Cachorro Quente       R$ 4,00\n" +
"2          X-Salada              R$ 4,50\n" +
"3          X-Bacon               R$ 5,00\n" +
"4          Torrada simples       R$ 2,00\n" +
"5          Refrigerante          R$ 1,50");
        L=sc.nextInt();
        System.out.println("Quantidade: ");
        Q=sc.nextInt();
        a=Q*4;
        b=Q*4.5;
        c=Q*5;
        d=Q*2;
        e=Q*1.5; 

        if(L == 1 ){
            System.out.printf("Total: R$ %.2f\n",a);
        }
        else if(L == 2 ){
             System.out.printf("Total: R$ %.2f\n",b);
        }
        else if(L == 3 ){ System.out.printf("Total: R$ %.2f\n",c);
        }
         else if(L == 4 ){ System.out.printf("Total: R$ %.2f\n",d);
        }
        else{
              System.out.printf("Total: R$ %.2f\n",e);
        }
    }
}
