package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ingrese un numero: ");
		int numero = scanner.nextInt();
		
		
		System.out.println("los primeros "+ numero+" multiplos de 6 son");
		
		for(int i = 1; i <= numero; i++) {
			System.out.println(6 * i);
	
		}
	scanner.close();
	}


	}


