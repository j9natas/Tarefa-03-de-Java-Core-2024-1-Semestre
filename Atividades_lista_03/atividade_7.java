package Atividades_lista_03;

import java.util.Scanner;

public class atividade_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio da lata de óleo: ");
        double raio = scanner.nextDouble();

        System.out.println("Digite a altura da lata de óleo: ");
        double altura = scanner.nextDouble();

        double volume = calcularVolume(raio, altura);

        System.out.println("O volume da lata de óleo é: " + volume);
    }

   
    public static double calcularVolume(double raio, double altura) {
      
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        return volume;
    }
}
