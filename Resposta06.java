import java.util.Scanner;

public class Resposta06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pagamento, venndas, comissao, pagamentoFinal;
        System.out.print("Digite o salário do fucionário: R$ ");
        pagamento = entrada.nextDouble();
        System.out.print("Digite quantas vendas ele fez: ");
        venndas = entrada.nextDouble();
        comissao = venndas * 0.04;
        pagamentoFinal = pagamento + comissao;
        System.out.print("O valor da comissão é: " +comissao+ "% .O salário final é: R$ " +pagamentoFinal);
        
        entrada.close();
    }
}   