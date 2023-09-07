import java.util.Scanner;

public class Respostas22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado, res;
        System.out.println("Digite os lados do polígono convexo: ");
        lado = entrada.nextDouble();
        res = lado * (lado - 3)/2;
        System.out.println("O número de diagonais é: "+ res);
        entrada.close();
        


    }
}
