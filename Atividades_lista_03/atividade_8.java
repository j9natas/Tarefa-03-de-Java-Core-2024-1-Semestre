package Atividades_lista_03;

import java.util.Scanner;

public class atividade_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem em horas: ");
        double tempo = scanner.nextDouble();

        System.out.print("Digite a velocidade média durante a viagem em Km/h: ");
        double velocidade = scanner.nextDouble();

        double distancia = tempo * velocidade;

       
        double consumoMedio = 12;
        double litrosUsados = distancia / consumoMedio;

        System.out.println("\nResultados da viagem:");
        System.out.println("Velocidade média: " + velocidade + " Km/h");
        System.out.println("Tempo gasto: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " Km");
        System.out.println("Litros de combustível utilizados: " + litrosUsados + " litros");

        scanner.close();
    }
}
	
