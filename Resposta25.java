import java.util.Scanner;

public class Resposta25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe a hora e os minutos
        System.out.print("Digite a hora: ");
        int hora = scanner.nextInt();

        System.out.print("Digite os minutos: ");
        int minutos = scanner.nextInt();

       
        int horaEmMinutos = hora * 60;

        
        int totalMinutos = horaEmMinutos + minutos;

        int totalSegundos = totalMinutos * 60;


        System.out.println("Hora digitada em minutos: " + horaEmMinutos + " minutos");
        System.out.println("Total de minutos: " + totalMinutos + " minutos");
        System.out.println("Total de minutos convertidos em segundos: " + totalSegundos + " segundos");

        scanner.close();
    }
}

