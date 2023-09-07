import java.util.Scanner;

public class Resposta04 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;
        System.out.print("Informe uma nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Informe uma nota: ");
        nota2 = entrada.nextDouble();
        media = (nota1 * 2 + nota2 * 3)/5;
        System.out.print("A nota do aluno(a) é: "+media);
        
        entrada.close();
    }
 
    
}