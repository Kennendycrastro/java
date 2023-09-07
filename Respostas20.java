import java.util.Scanner;

public class Respostas20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double angulo,distancia, medida;
        System.out.println("digite o ângulo da escada:  ");
        angulo = entrada.nextDouble();
        System.out.println("digite a distancia da escada da parede: ");
        distancia = entrada.nextDouble();
        medida = distancia / Math.sin(Math.toRadians(angulo));
        System.out.println("A medida da escada é: " + medida);
        entrada.close();
 

    }
}
