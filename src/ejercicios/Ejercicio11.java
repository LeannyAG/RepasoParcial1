package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ingrese el primer numero: ");
		int a = scanner.nextInt();
		
		System.out.println("ingrese el segundo  numero: ");
		int b = scanner.nextInt();
		
		
		int mayor = 0;
		int menor = 0;
		
		if(a > b ) {
		    mayor = a;
		    menor = b;
		}else {
			mayor = b;
			menor = a;
		}
		int diferencia = Math.abs(a - b);
		
		System.out.println("el numero mayor es "+ mayor);
		System.out.println("el numero menor es "+ menor);
		System.out.println("la diferencia de los numeros es "+ diferencia );
		
		
		scanner.close();
	}
     
}
