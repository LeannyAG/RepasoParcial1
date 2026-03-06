package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("ingrese la cantidad de numeros: ");
		int num = scanner.nextInt();
		
		int contador = 0;
		int suma = 0;
		
		for(int i = 1; i <= num; i++) {
			
			System.out.println("ingrese un numero: ");
			int n = scanner.nextInt();
			
			if(n < 0) {
				suma += num;
				contador++;
			}
		}
		if(contador > 0) {
			double promedio = (double) suma / contador;
			System.out.println("promedio de numeros negativos: "+ promedio );
		}else {
			System.out.println("no hay negativos  ");
		}
		
		scanner.close();
	}

}
