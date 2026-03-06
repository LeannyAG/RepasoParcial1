package ejercicios;
import java.util.Scanner;
public class Ejercicio6 {

	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("ingrese un numero: ");
		int numero = scanner.nextInt();
		
		if(numero % 7 == 0 || numero % 11 == 0) {
			System.out.println("el numero es multiplo de 7 o de 11");
		}else {
			System.out.println("el numero no es multiplo de 7 o de 11 ");
		}
	scanner.close();
	}

}
