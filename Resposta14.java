import java.util.Scanner;

public class Resposta14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double anoNa, anoAtu, meses,anos, dias, semanas;
        System.out.println("digite o ano que a pessoa nasceu: ");
        anoNa = entrada.nextDouble();
        System.out.println("digite o ano atual: ");
        anoAtu = entrada.nextDouble();
        anos = anoAtu - anoNa;
        meses = (anoAtu - anoNa) * 12;
        dias = (anoAtu - anoNa) * 365;
        semanas = (anoAtu - anoNa) * dias / 7;
        System.out.println("A idade da pessoa em Anos: "+ anos);
        System.out.println("A idade da pessoa em meses: "+ meses);
        System.out.println("A idade da pessoa em dias: "+ dias);
        System.out.println("A idade da pessoa em semanas: "+ semanas);
        entrada.close();
        




    }
}
