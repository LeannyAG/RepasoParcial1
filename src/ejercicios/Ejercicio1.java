package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner  = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        
        int suma = 0; 
        
        for(int i = 1; i <= num; i++) {
        if(i % 4 == 0) {
        	suma = suma + i;
        }
        
		
		
		
		
	}
        System.out.println(" la summa de los numeros divisibles entre 4 es: "+suma);
        scanner.close();
}
}
