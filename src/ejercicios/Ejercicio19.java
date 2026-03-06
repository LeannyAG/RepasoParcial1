package ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ingrese un numero: ");
		int numero = scanner.nextInt();
		
		int suma = 0;
		
		for(int i = 1; i <= numero; i++) {
			suma += i;
		}
		if(suma % 2 == 0) {
			System.out.println("la suma es par");
		}else {
			System.out.println("la suma es impar ");
		}
		scanner.close();
	}

}
