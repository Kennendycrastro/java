import java.util.Scanner;

public class Resposta23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a medida do primeiro ângulo: ");
        double angulo1 = entrada.nextDouble();

        System.out.print("Digite a medida do segundo ângulo: ");
        double angulo2 = entrada.nextDouble();
        double angulo3 = 180.0 - (angulo1 + angulo2);
        System.out.println("A medida do terceiro ângulo é: " + angulo3 + " graus");
        entrada.close();
    }
}
