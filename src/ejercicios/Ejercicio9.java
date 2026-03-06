package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ingrese un numero (1 -5)");
		int numero = scanner.nextInt();
		
		switch(numero ) {
		case 1:
			System.out.println("I");
			break;
		case 2:
			System.out.println("II");
			break;
		case 3:
			System.out.println("III");
			break;
		case 4:
			System.out.println("IV");
			break;
		case 5: 
			System.out.println("V");
			break;
			default:
				System.out.println("numero fuera del rango ");
		}
		
		scanner.close();
	}

}
