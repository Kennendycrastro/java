import java.util.Scanner;

public class Resposta10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado1, area;
        System.out.print("Digite um lado do quadrado: ");
        lado1 = entrada.nextDouble();
        area = lado1 * lado1;
        System.out.print("A área do quadrado é: "+ area);

        entrada.close();
        
    }
}
