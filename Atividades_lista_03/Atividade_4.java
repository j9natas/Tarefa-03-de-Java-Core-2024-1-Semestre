package Atividades_lista_03;
import java.util.Scanner;

public class Atividade_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        double custoConsumidor = calcularCustoConsumidor(custoFabrica, percentualDistribuidor, percentualImpostos);

        System.out.println("O custo final ao consumidor é: R$" + custoConsumidor);

        scanner.close();
    }

   
    public static double calcularCustoConsumidor(double custoFabrica, double percentualDistribuidor, double percentualImpostos) {
     
        double custoTotal = custoFabrica + (custoFabrica * percentualDistribuidor) + (custoFabrica * percentualImpostos);
        return custoTotal;
    }
}
	

