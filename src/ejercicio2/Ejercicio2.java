package ejercicio2;

import exceptions.CustomException;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        try {
	            throw new CustomException("esto es un objeto exception ");
	        } catch (CustomException e) {
	            System.out.println("Captura con mensaje: " + e.getMessage());
	        }
	    }
}
