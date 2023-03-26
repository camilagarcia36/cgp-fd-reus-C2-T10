package ejercicio4;
import exceptions.CustomException;

public class Calculadora {

    public double suma(double num1, double num2) {
        return num1 + num2;
    }

    public double resta(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) throws CustomException {
        if (num2 == 0) {
            throw new CustomException("No se puede dividir por cero");
        }
        return num1 / num2;
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double raizCuadrada(double num) throws CustomException {
        if (num < 0) {
            throw new CustomException("No se puede calcular la raiz cuadrada de un número negativo");
        }
        return Math.sqrt(num);
    }

    public double raizCubica(double num) throws CustomException {
        if (num < 0) {
            throw new CustomException("No se puede calcular la raiz cubica de un número negativo");
        }
        return Math.cbrt(num);
    }
}

