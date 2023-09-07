import java.util.Scanner;

public class Resposta15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, conta1, conta2, salarioRes;
        System.out.println("Digite o salário do João: ");
        salario = entrada.nextDouble();
        System.out.println("Digite o valor da conta: ");
        conta1 = entrada.nextDouble()* 1.02;
        System.out.println("Digite o valor da outra conta: ");
        conta2 = entrada.nextDouble() * 1.02;
        salarioRes = salario - conta1 - conta2;
        System.out.println("O restante do salário sera: "+salarioRes);
        entrada.close();


       

    
    }
}