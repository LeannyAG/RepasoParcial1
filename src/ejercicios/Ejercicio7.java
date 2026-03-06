package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("ingrese un numero: ");
		int n = scanner.nextInt();
		
		System.out.println("numeros divisibles entre 3 pero no entre 2");
		
		for(int i = 1; i <= n; i++) {
			
			if(i % 3 == 0 && i % 2 != 0) {
				System.out.println(i);
			}
		}
		scanner.close();
	}

}
