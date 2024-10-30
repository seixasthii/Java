package toguro.exercicios_java;
import java.util.Scanner;
public class Animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x, y, z;
        System.out.println("Vertebrado ou Invertebrado: ");
        x = sc.nextLine();
        System.out.println("Vertebrado(Ave, Mamifero), Invertebrado(Inseto ou anelideo): ");
        y = sc.nextLine();
        System.out.println("Ave(Carnivoro, onivaro), Mamifero(onivoro, herbivoro), Inseto(hematofago, herbivoro), anelideo(hematofago, onivaro)");
        z = sc.nextLine();

        if (x.equals("vertebrado") && y.equals("mamifero") && z.equals("onivoro")){
            System.out.printf("homem\n");
        } else if (x.equals("vertebrado") && y.equals("mamifero") && z.equals("herbivoro")) {
            System.out.printf("vaca\n");
        } else if (x.equals("vertebrado") && y.equals("ave") && z.equals("carnivoro")) {
            System.out.printf("aguia\n");
        } else if (x.equals("vertebrado") && y.equals("ave") && z.equals("onivoro")) {
            System.out.printf("pomba\n");
        } else if (x.equals("invertebrado") && y.equals("inseto") && z.equals("hematofago")) {
            System.out.printf("pulga\n");
        } else if (x.equals("invertebrado") && y.equals("inseto") && z.equals("herbivoro")) {
            System.out.printf("lagarta\n");
        } else if (x.equals( "invertebrado") && y.equals("anelideo") && z.equals("hematofago")) {
            System.out.printf("sanguessuga\n");
        } else {
            System.out.printf("minhoca\n");
        }
    }
}
