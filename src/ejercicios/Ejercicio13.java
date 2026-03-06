package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("ingrese un numero: ");
		int n = scanner.nextInt();
		
		int contador = 0;
		
		while( n != 0) {
			
			int digito = n % 10;
			
			if(digito % 2 == 0) {
				contador++;
			}
			n = n / 10;
		}
		System.out.println("la cantidad de digitos pares es: " + contador);
		
		scanner.close();
		
	}

}
