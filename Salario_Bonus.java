package toguro.exercicios_java;
import java.util.Scanner;
public class Salario_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do funcionario: ");
        String nome= sc.nextLine();
        double sal,vendas;
        System.out.println("Qual seu salario: ");
        sal=sc.nextDouble();
        System.out.println("Quantas vendas o mesmo realizou: ");
        vendas=sc.nextDouble();
        double bonus= vendas*15/100;
        System.out.printf("Salario com Bonus = R$ %.2f\n",bonus+sal);
    }
}
