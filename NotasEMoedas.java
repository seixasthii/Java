package toguro.exercicios_java;

import java.util.Scanner;

public class NotasEMoedas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, a, y;
        int not100, not50, not20, not10, not5, not2, mod1, mod05, mod025, mod010, mod005, mod001;
        x = sc.nextDouble();
        not100 = (int) x / 100;
        not50 = ((int) x % 100) / 50;
        not20 = (((int) x % 100) % 50) / 20;
        not10 = ((((int) x % 100) % 50) % 20) / 10;
        not5 = (((((int) x % 100) % 50) % 20) % 10) / 5;
        not2 = ((((((int) x % 100) % 50) % 20) % 10) % 5) / 2;
        a = (((((x % 100) % 50) % 20) % 10) % 5) % 2;
        y = a * 100;
        mod1 = (int) y / 100;
        mod05 = ((int) y % 100) / 50;
        mod025 = (((int) y % 100) % 50) / 25;
        mod010 = ((((int) y % 100) % 50) % 25) / 10;
        mod005 = (((((int) y % 100) % 50) % 25) % 10) / 5;
        mod001 = (((((int) y % 100) % 50) % 25) % 10) % 5;
        System.out.println("NOTAS:\n"
                + not100 + " nota(s) de R$ 100.00\n"
                + not50 + " nota(s) de R$ 50.00\n"
                + not20 + " nota(s) de R$ 20.00\n"
                + not10 + " nota(s) de R$ 10.00\n"
                + not5 + " nota(s) de R$ 5.00\n"
                + not2 + " nota(s) de R$ 2.00\n" + "MOEDAS:\n"
                + mod1 + " moeda(s) de R$ 1.00\n"
                + mod05 + " moeda(s) de R$ 0.50\n"
                + mod025 + " moeda(s) de R$ 0.25\n"
                + mod010 + " moeda(s) de R$ 0.10\n"
                + mod005 + " moeda(s) de R$ 0.05\n"
                + mod001 + " moeda(s) de R$ 0.01");
    }
}
