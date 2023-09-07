import java.util.Scanner;

public class Resposta09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double baseMaior, baseMenor, area, altura;
        System.out.print("Digite a base maior do trapézio: ");
        baseMaior = entrada.nextDouble();
        System.out.print("Digite a base menor do trapézio: ");
        baseMenor = entrada.nextDouble();
        System.out.print("Digite a altura do trapézio: ");
        altura = entrada.nextDouble();
        area = ((baseMaior + baseMenor) * altura)/2;
        System.out.print("A área do trapézio é: "+ area);
        entrada.close();



    }
}
