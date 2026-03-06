package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
static Scanner scanner = new Scanner(System.in);

            public static void main(String[] args) {
            	
            	System.out.println("ingrese una cantidad de numeros: ");
            	int n = scanner.nextInt();
            	
            	int positivos = 0;
            	int negativos = 0;
            	int ceros = 0;
            	
            	for(int i = 1; i <= n; i ++) {
            		System.out.println("ingrese un numero: ");
            		int num = scanner.nextInt();
            		
            		
            		if(num > 0) {
            			positivos++;
            		} else if(num < 0 ) {
            			negativos++;
            		} else {
            			ceros++;
            		}
            			
            	}
            	
            	System.out.println("cantidad de positivos: " + positivos++);
            	System.out.println("cantidad de negativos: "+ negativos++);
            	System.out.println("cantidad de ceros: " + ceros++);
            	
            	
            	scanner.close();
            	
            	
            }
}
