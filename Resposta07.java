import java.util.Scanner;

public class Resposta07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o peso antigo da pessoa: ");
        double pesoAntigo = entrada.nextDouble();

        System.out.print("Digite o novo peso da pessoa: ");
        double novoPeso = entrada.nextDouble();

        double aumento15 = pesoAntigo * 0.15;
        double aumento20 = pesoAntigo * 0.20;

        if (novoPeso > pesoAntigo) {
            if (novoPeso <= pesoAntigo + aumento15) {
                System.out.println("A pessoa engordou até 15% do peso antigo.");
            } else if (novoPeso <= pesoAntigo + aumento20) {
                System.out.println("A pessoa engordou entre 15% e 20% do peso antigo.");
            } else {
                System.out.println("A pessoa engordou mais de 20% do peso antigo.");
            }
        } else if (novoPeso < pesoAntigo) {
            System.out.println("A pessoa emagreceu.");
        } else {
            System.out.println("O peso da pessoa não mudou.");
        }

       entrada.close();
    }
}
