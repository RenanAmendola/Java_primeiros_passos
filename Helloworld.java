package Familia51;

import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		
		
		
		int x, y, z;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite 3 numeros");
		
		x = leia.nextInt();
		y = leia.nextInt();
		z = leia.nextInt();
		
		if(x>y && x>z){
			System.out.println(x+" é o maior numero");
		};
		

		if(y>x && y>z){
			System.out.println(y+" é o maior numero");
		};
		
		if(z>y && z>x){
			System.out.println(z+" é o maior numero");
		};
		
		
		
		
	}

}
