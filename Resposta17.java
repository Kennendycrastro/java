import java.util.Scanner;

public class Resposta17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio, compriEsfera, area, volume, pi;
        System.out.println("Digite o raio: ");
        raio = entrada.nextDouble();
        pi = 3.14;
        compriEsfera = 2 * pi * raio;
        area = pi * (raio  * raio);
        volume = 3/4 * pi *(raio * raio * raio);
        System.out.println("O comprimento da esfera é: " + compriEsfera);
        System.out.println("A área da esfera é: " + area);
        System.out.println("O volume da esfera é "+ volume);
        entrada.close();




    }
}
