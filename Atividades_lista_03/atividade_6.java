package Atividades_lista_03;

import java.util.Scanner;

public class atividade_6 {

	
	public static void main(String[] args) {
	
	
		Scanner scanner = new Scanner(System.in);

		
		 System.out.print("Digite a temperatura em Fahrenheit: ");
	        
		
		 double temperaturaFahrenheit = scanner.nextDouble();
		 
		 scanner.close();
		 
		 
		 
		 double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5/9;
		 
		 
		 
		 System.out.println("A temperatura em Celsius é: " + temperaturaCelsius);
    }
}
		
		
		
	

