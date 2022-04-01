package Familia51;

import java.util.Scanner;

public class Atividad33 {

	
	
	
	public static void main(String[] args) {
		
		
Scanner leia = new Scanner(System.in);
		
	int x;	
		
		System.out.println("Coloque a sua idade");
		
		
		x =leia.nextInt();
		
		
		if (x >= 18 && x <= 25) {

	System.out.println("Você esta na categoria adulto");
}
		
		if (x >= 10 && x <= 14) {

	System.out.println("Você esta na categoria infantil");
}		
		
		if (x >= 15 && x <= 17) {

	System.out.println("Você esta na categoria juvenil");
}	
			
		
		if (x >= 26 || x < 10) {

	System.out.println("Categoira indisponivel");
}	
		
		
	}
}