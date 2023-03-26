package ejercicio4;


import java.util.Scanner;
import exceptions.CustomException;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();

		int opcion = 0;

		do {
			System.out.println("\n=== CALCULADORA ===");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. División");
			System.out.println("5. Potencia");
			System.out.println("6. Raíz cuadrada");
			System.out.println("7. Raíz cúbica");
			System.out.println("8. Salir");

			System.out.print("Ingrese una opción: ");
			opcion = scanner.nextInt();

			if (opcion >= 1 && opcion <= 7) {
				System.out.print("Ingrese el primer número: ");
				double num1 = scanner.nextDouble();

				System.out.print("Ingrese el segundo número: ");
				double num2 = scanner.nextDouble();

				switch (opcion) {
				case 1:
					System.out.println("Resultado: " + calculadora.suma(num1, num2));
					break;
				case 2:
					System.out.println("Resultado: " + calculadora.resta(num1, num2));
					break;
				case 3:
					System.out.println("Resultado: " + calculadora.multiplicacion(num1, num2));
					break;
				case 4:
					try {
						System.out.println("Resultado: " + calculadora.division(num1, num2));
					} catch (CustomException e) {
						System.out.println("Error: " + e.getMessage());
					}
					break;
				case 5:
					System.out.println("Resultado: " + calculadora.potencia(num1, num2));
					break;
				case 6:
					try {
						System.out.println("Resultado: " + calculadora.raizCuadrada(num1));
					} catch (CustomException e) {
						System.out.println("Error: " + e.getMessage());
					}
					break;
				case 7:
					try {
						System.out.println("Resultado: " + calculadora.raizCubica(num1));
					} catch (CustomException e) {
						System.out.println("Error: " + e.getMessage());
					}
					break;
				}
			} else if (opcion == 8) {
				System.out.println("Saliendo del programa...");
			} else {
				System.out.println("Opción no válida");
			}

		} while (opcion != 8);

		scanner.close();
		
	}
}
