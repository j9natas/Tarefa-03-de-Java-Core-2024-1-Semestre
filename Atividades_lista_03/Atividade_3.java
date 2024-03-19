

 
package Atividades_lista_03;
   
import java.util.Scanner;

public class Atividade_3 {

	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Informe o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();
	
	
        System.out.print("Informe o percentual de reajuste: ");
        double percentualReajuste = scanner.nextDouble();
        
        
        
        double valorReajuste = salarioAtual * (percentualReajuste / 100);
	
	
        double novoSalario = salarioAtual + valorReajuste;
        
        
        System.out.println("O novo salário do funcionário é: " + novoSalario);
        
        scanner.close();
        
        
        
        
	}
	
}
