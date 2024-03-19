package conti_java_core3;

import java.util.Scanner;

public class Atividade_10 {

	
	 public static void main(String[] args) {
	    
		 Scanner scanner = new Scanner(System.in);

	
		 System.out.println("Digite o valor para a variável A:");
	        String valorA = scanner.nextLine();

	
	        System.out.println("Digite o valor para a variável B:");
	        String valorB = scanner.nextLine();
	

	        System.out.println("Valores antes da troca:");
	        System.out.println("A = " + valorA);
	        System.out.println("B = " + valorB);

	        
	        String temp = valorA;
	        valorA = valorB;
	        valorB = temp;
	        
	        
	        
	        System.out.println("Valores depois da troca:");
	        System.out.println("A = " + valorA);
	        System.out.println("B = " + valorB);

	        scanner.close();
	    }
	}
	        

