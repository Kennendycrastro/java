import java.util.Scanner;

public class Resposta18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cel, fah;
        System.out.println("Digite uma temperatura em Celsius");
        cel = entrada.nextDouble();
        fah = 180 * (cel + 32/100);
        System.out.println("A temperatura em Fahrenheit é: " + fah);
        entrada.close();
    }

    
}