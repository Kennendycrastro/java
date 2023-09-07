import java.util.Scanner;

public class Resposta08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pesoKg, pesoG;
        System.out.println("Digite seu peso: ");
        pesoKg = entrada.nextDouble();
        pesoG = pesoKg * 1000;
        System.out.println("Seu peso  em gramas é: "+ pesoG +"g.");
        entrada.close();
    }

    
}