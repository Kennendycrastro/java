import java.util.Scanner;

public class Resposta03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2, res;
        System.out.println("Digite um número: ");
        num1 = entrada.nextDouble();
        System.out.println("Digite um número: ");
        num2 = entrada.nextDouble();
        res = num1 / num2;
        System.out.println("O resultado é: "+ res);
        entrada.close();



    }

    
}