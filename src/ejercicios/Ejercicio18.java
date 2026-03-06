package ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("ingrese los numeros");
		int n = scanner.nextInt();
		
		int invertido = 0;
		
		while(n != 0) {
			
			int digito = n % 10;
			invertido = invertido * 10 + digito;
			n = n / 10;
		}
		System.out.println("Número invertido: " + invertido);
		scanner.close();
	}

}
