import java.util.Scanner;

public class Resposta05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor, valor2;
        System.out.print("Informe o valor do produto: ");
        valor = entrada.nextDouble();
        valor2 = ( valor * 0.90);
        System.out.println("O novo valor do produto é: "+valor2);
        entrada.close();
    }
}
