import java.util.Scanner;

public class Resposta11 {
      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double diagonalMaior, diagonalMenor, area;
        System.out.print("Digite a base maior do losango: ");
        diagonalMaior = entrada.nextDouble();
        System.out.print("Digite a base menor do losango: ");
        diagonalMenor = entrada.nextDouble();
        area = (diagonalMaior * diagonalMenor)/2;
        System.out.print("A área do losango é: "+area);
        entrada.close();



    }
}
