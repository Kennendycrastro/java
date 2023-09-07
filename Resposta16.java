import java.util.Scanner;

public class Resposta16 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double cat1, cat2, hipo;
       System.out.println("Digite o primeiro catetos");
       cat1 = entrada.nextDouble();
       System.out.println("Digite segundo catetos");
       cat2 = entrada.nextDouble();
       hipo = Math.sqrt(cat1 * cat1 + cat2 * cat2 );
       System.out.println("A hipotenusa é:  "+ hipo);
       entrada.close();



     
    }
}
