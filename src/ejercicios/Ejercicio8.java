package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("ingrese la hora:(0-23) ");
		int hora = scanner.nextInt();
		
		if(hora >= 6 && hora < 12) {
			System.out.println("mañana");
		}else if(hora >= 12 && hora < 18) {
			System.out.println("tarde ");		
		}else if(hora >= 18 && hora < 24) {
			System.out.println("noche ");
		}else {
			System.out.println("hora invalida ");
		}
		scanner.close();
	}
}
