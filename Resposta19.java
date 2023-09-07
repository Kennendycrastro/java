import java.util.Scanner;

public class Resposta19 {
   public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double metros,largura, watts ;
    System.out.println("Digite  a quantidade de metros: ");
    metros = entrada.nextDouble();
    System.out.println("digite a largura do comodo: ");
    largura = entrada.nextDouble();
    watts =(metros * largura) * 18;
    System.out.println("A quantidade de watts necessários é: "+watts);
    entrada.close();




   }
}