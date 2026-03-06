package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("elija una opcion (1-3");
		int opcion = scanner.nextInt();
		
		System.out.println("ingrese el primer numero: ");
		int num1 = scanner.nextInt();
		
		System.out.println("ingrese el primer numero: ");
		int num2 = scanner.nextInt();
		
		switch(opcion) {
		
		case 1: 
			System.out.println("resultado:  " + (num1 + num2));
			break;
		case 2:
			System.out.println("resultado:  " + (num1 - num2));
			break;
		case 3: 
			System.out.println("resultado:  " + (num1 * num2));
			break;
	
			
			default:
				System.out.println("opcion invalida");
				
		}
		scanner.close();
	}
	

}
