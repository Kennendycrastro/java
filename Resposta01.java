import java.util.Scanner;

public class Resposta01 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double res, num1, num2;
        System.out.print("Informe um número: ");
        num1 = entrada.nextDouble();
        System.out.print("Informe um número: ");
        num2 = entrada.nextDouble();
        res = num1 - num2;
        System.out.print("A subtração dos valores é: "+ res);
         
        entrada.close();

       
        
    }

    
}