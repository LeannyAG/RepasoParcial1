package ejercicios;

import java.util.Scanner;

public class Ejeercicio20 {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);

        scanner.close();
	}

}
