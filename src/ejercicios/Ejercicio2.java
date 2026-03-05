package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	 static Scanner scanner = new Scanner(System.in);


	    public static void main(String[] args) {
	      
	    	
	    	System.out.println("ingrese el numero: ");
	    	int numero = scanner.nextInt();
	    	
	    	long factorial = 1;
	    	
	    	for(int i =  1; i <= numero; i ++) {
	    		    factorial = factorial * i;
	    	}
	    	
	    	System.out.println("el factorial de " + numero  + "es igual a " + factorial);
	    	
	    	scanner.close();
	    }

	}


