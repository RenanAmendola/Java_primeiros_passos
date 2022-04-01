package Familia51;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		
		
		int x, y, z;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite 3 numeros");
		
		x = leia.nextInt();
		y = leia.nextInt();
		z = leia.nextInt();
		
		if(x>y && x>z){
			
			if(y>z) {
				System.out.println(z+", "+y+", "+x);
				
			}else if(z>y){
				System.out.println(y+", "+z+", "+x);
				
			}
		};
		

		if(y>x && y>z){
		
		
			if(x>z) {
				System.out.println(z+", "+x+", "+y);
			}else {
				System.out.println(x+", "+z+", "+y);
				
			}
		}
		
		
		if(z>y && z>x){
			
		
			if(y>x) {
				System.out.println(x+", "+y+", "+z);
				
			
			}else if(x>y){
				System.out.println(y+", "+x+", "+z);
				
			}
		}
		
		System.out.println("Eis a ordem crescente");
		
		
	}

}
