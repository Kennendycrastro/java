import java.util.Scanner;

public class Resposta12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMini, salarioFuci, salarioRece;
        System.out.println("Digite um valor para o salário mínimo : ");
        salarioMini = entrada.nextDouble();
        System.out.println("Digite o salario do fucionário: ");
        salarioFuci = entrada.nextDouble();
        salarioRece = salarioFuci / salarioMini;
        System.out.println("O fucionário ganha: "+ salarioRece + "salários mínimos");

        entrada.close();



    }
}
