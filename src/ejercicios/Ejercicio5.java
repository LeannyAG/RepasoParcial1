package ejercicios;


import java.util.Scanner;

	
public class Ejercicio5 {
	
	static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
    	System.out.println("ingrese un numero: ");
    	int num = scanner.nextInt();
    	
    	int suma = 0;
    	
    	while(num != 0) {
    		suma += num % 10;
    		num = num / 10;
    		
    		
    	}
    	System.out.println("la suma de los digitos es: " + suma);
    	scanner.close();
    }

}
