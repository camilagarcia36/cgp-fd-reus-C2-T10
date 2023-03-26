package ejercicio3;

import java.util.Random;

import exceptions.CustomException;

public class Ejercicio3 {
	public static void main(String[] args) {

		 Random rand = new Random();
	        int numero = rand.nextInt(1000);
	        
	        try {
	            if (numero % 2 == 0) {
	                System.out.println("El numero que se ha generado es el siguiente " + numero + " y es par.");
	            } else {
	                throw new CustomException("El numero que se ha generado es el siguiente " + numero + " y es impar.");
	            }
	        } catch (CustomException e) {
	            System.out.println(e.getMessage());
	        }
	}

}