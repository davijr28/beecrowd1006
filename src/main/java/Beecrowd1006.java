import java.util.Scanner;
public class Beecrowd1006 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        double A,B,C,MEDIA;
       
        //ler variáveis
        A = leitor.nextDouble();
        B = leitor.nextDouble();
        C = leitor.nextDouble();
        
        MEDIA = (A*2+B*3+C*5)/10;
        
        //mostrar resultado no console
        System.out.printf("MEDIA = %.1f%n", MEDIA);
    }
}