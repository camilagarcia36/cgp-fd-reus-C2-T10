package ejercicio5;
import java.util.Scanner;
import exceptions.CustomException;
public class Ejercicio5Main {

	    public static void main(String[] args) throws CustomException {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Introduce la longitud de los passwords: ");
	            int longitud = scanner.nextInt();

	            System.out.print("Introduce el tamaño del array: ");
	            int tamaño = scanner.nextInt();

	            Password[] passwords = new Password[tamaño];
	            boolean[] esFuerteArray = new boolean[tamaño];

	            for (int i = 0; i < tamaño; i++) {
	                passwords[i] = new Password(longitud);
	                esFuerteArray[i] = passwords[i].esFuerte();
	            }

	            for (int i = 0; i < tamaño; i++) {
	                System.out.println(passwords[i].getContraseña() + " " + esFuerteArray[i]);
	            }
	        } finally {
	            scanner.close();
	        }
	    }
	}
