package Familia51;

import java.util.Scanner;

public class Atividade4 {


	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
		
	double x;
		
		
		
	System.out.println("Escreva um numero");	
		
		
	x = leia.nextDouble();
		
		
	
	if(x % 2 == 0) {
		System.out.print("O numero é par e sua raiz é ");
		x = Math.sqrt(x);
		System.out.println(x);
	
	}else{
		System.out.print("O numero é impar e o quadrado de "+ x +" vai dar ");
		x = Math.pow(x, 2);
		System.out.println(x);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
