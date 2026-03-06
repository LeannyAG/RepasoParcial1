package ejercicios;

import java.util.Scanner;

public class Ejercicios {

	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("ingrese un numero:  ");
		int num = scanner.nextInt();
		
		for( int i = 1; i <= 10; i++) {
			
			if( i != 0) {
				System.out.println(num + " / " + i + " = " + (num /(double)i));
			}
		}
		scanner.close();
	}

}
