import java.util.Scanner;

public class Resposta24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de dinheiro em reais: ");
        double dinheiroEmReais = entrada.nextDouble();

        double taxaDolar = 1.80;
        double taxaMarcoAlemao = 2.00;
        double taxaLibraEsterlina = 3.57;
        double dolares = dinheiroEmReais / taxaDolar;
        double marcoAlemao = dinheiroEmReais / taxaMarcoAlemao;
        double libraEsterlina = dinheiroEmReais / taxaLibraEsterlina;
        System.out.println("Quantidade em dólares: $" + dolares);
        System.out.println("Quantidade em marco alemão: " + marcoAlemao + " DEM");
        System.out.println("Quantidade em libra esterlina: £" + libraEsterlina);
        entrada.close();
    }
}

