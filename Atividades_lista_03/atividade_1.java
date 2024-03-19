
package Atividades_lista_03;

import java.util.Scanner;
public class atividade_1 {

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite sua idade compreta atual:");
		int idade=sc.nextInt();
		System.out.println("Digite a quantidade de messes desde de seu ultimo aniversario:");
		int meses=sc.nextInt();
		System.out.println("Digite quntos dias que passou no seu ultimo mesversario:");
		int dias=sc.nextInt();
		int quantidadedeDiasVividos=idade*365+meses*30+dias;
		System.out.println("A quntidade de dias vividos correspondentes em dias é: "+ quantidadedeDiasVividos);
		sc.close();
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

