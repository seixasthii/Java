package toguro.exercicios_java;
import java.util.Scanner;
public class Media_escolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3, n4, ne, media, mf;
        System.out.println("Digite as 4 notas semestrais: ");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();
        
        media = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
        if(media >= 7){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        }
        else if(media>=5 && media<7){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno em exame.");
            System.out.println("Nota do exame: ");
            ne = sc.nextFloat();         
            
            mf = (media + ne) /2;    
            if (mf>6){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n",mf);
            }
            else{
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n",mf);
            }
            
        }
        else{
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        }
    }
}
