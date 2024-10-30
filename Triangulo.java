package toguro.exercicios_java;
import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double a,b,c,p,ar;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        p=a+b+c;
        ar=(a+b)*c/2;
        if(a+b>c && c+b>a && c+a>b){
            System.out.printf("Perimetro = %.1f\n",p);
        }
        else{
        System.out.printf("Area = %.1f\n",ar); 
        }
    }
}
