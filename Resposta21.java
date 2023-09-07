import java.util.Scanner;

public class Resposta21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();
        
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();
        
        System.out.print("Digite o número de horas extras trabalhadas:");
        double horasExtras = scanner.nextDouble();
        double valorHoraTrabalhada = (1.0 / 8.0) * salarioMinimo;
        double valorHoraExtra = (1.0 / 4.0) * salarioMinimo;
        double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
        double quantiaHorasExtras = horasExtras * valorHoraExtra;
        double salarioAReceber = salarioBruto + quantiaHorasExtras;
        System.out.printf("Salário a receber: R$ %.2f%n", salarioAReceber);
        scanner.close();
    }
}