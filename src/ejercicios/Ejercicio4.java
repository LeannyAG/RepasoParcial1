package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	

	static Scanner scanner = new Scanner(System.in);

	            public static void main(String[] args) {
	            	
	            	System.out.println("ingrese un numero: ");
	            	int n = scanner.nextInt();
	            	
	            	int suma = 0;
	            	int contador = 0;
	            	
	            	for(int i = 1; i <= n; i++) {
	            		
	            		if(i % 2 == 0) {
	            		suma += i;
	            		contador++;
	            		
	            		
	            	}
	            }
	            	
	            	double promedio = (double) suma  / contador;
	            	
	            	System.out.println(" el promedio de los numeros pares entre 1 y  " + n + " es: " + promedio);
	            	
	            	scanner.close();

}
}
