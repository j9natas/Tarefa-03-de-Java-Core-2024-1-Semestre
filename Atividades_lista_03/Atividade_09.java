package conti_java_core3;

import java.util.Scanner;

public class Atividade_09 {

	public static void main(String[] args) {
       
		Scanner scanner = new Scanner(System.in);

	
		System.out.print("Digite o valor principal: ");
        double valorPrincipal = scanner.nextDouble();

        System.out.print("Digite a taxa de juros em porcentagem: ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Digite o tempo em atraso (em meses): ");
        int tempoAtraso = scanner.nextInt();

        double prestacao = calcularPrestacao(valorPrincipal, taxaJuros, tempoAtraso);

        System.out.println("O valor da prestação em atraso é: " + prestacao);

        scanner.close();
    }

    public static double calcularPrestacao(double valor, double taxa, int tempo) {
        return valor + (valor * taxa / 100) * tempo;
    }
}
        

