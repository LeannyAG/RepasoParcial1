package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("ingrese un numero: ");
		int num = scanner.nextInt();
		
		int suma = 0;
		int k = 1;
		
		while( suma < num) {
			suma = suma + k;
			k++;
			
		}
		if( suma == num) {
			System.out.println("el numero es triangualr ");
		}else {
			System.out.println("el numero no es triangular ");
		}
		scanner.close();
	}

}
