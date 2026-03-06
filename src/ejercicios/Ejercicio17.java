package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("ingrese un numero: ");
		int n = scanner.nextInt();
		
		int num = n;
		
		while(num > 1) {
			
			if(num % 2 != 0) {
				break;
				
			}
			num = num /2;
		}
		
		if(num == 1) {
			System.out.println(n  + " es potencia de 2 ");
		}else {
			System.out.println("el numero no es potencia de 2");
		}
		
		scanner.close();
	}
}
