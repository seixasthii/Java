package toguro.exercicios_java;
import java.util.Scanner;
public class Conversao_Tempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,hora,minutos,segundos;
        
        N = sc.nextInt();
        hora = N/3600;
        minutos = (N%3600)/60;
        segundos = (N%3600)%60;
        
        System.out.println(hora + ":" + minutos + ":" + segundos);
    }
}
