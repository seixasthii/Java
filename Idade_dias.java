package toguro.exercicios_java;
import java.util.Scanner;
public class Idade_dias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, a, m, d;
        x=sc.nextInt();
        a = (x/365);
        m = ((x%365)/30);
        d = ((x%365)%30);
        System.out.println(a + " ano(s)");
        System.out.println(m + " mes(es)");
        System.out.println(d + " dia(s)");
    }
}
