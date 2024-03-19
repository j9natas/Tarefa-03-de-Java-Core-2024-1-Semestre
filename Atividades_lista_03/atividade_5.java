package Atividades_lista_03;

import java.util.Scanner;

public class atividade_5 {

	
	 public static void main(String[] args) {
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Digite a temperatura em graus Celsius: ");
	        double temperaturaCelsius = scanner.nextDouble();
	        
	        
	        scanner.close();
	        
	        
	        double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;
		 
		 
	        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
	    }
	}
		 
		 
		 
		 