import java.util.Scanner;

public class Resposta02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double num1, num2, num3,res;
        System.out.print("Informe um número: ");   
        num1 = entrada.nextDouble();
        System.out.print("Informe um número: ");
        num2 = entrada.nextDouble();
        System.out.print("Informe um número: ");
        num3 = entrada.nextDouble();
        res = num1 * num2 * num3;
        System.out.print("A multiplicação desses números é: "+ res);
        
        entrada.close();

    
    } 
}
