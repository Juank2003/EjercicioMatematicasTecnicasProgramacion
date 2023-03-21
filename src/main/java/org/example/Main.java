package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el coeficiente del primer polinomio: ");
        int coef1 = scanner.nextInt();
        System.out.println("Ingrese el exponente del primer polinomio: ");
        int exp1 = scanner.nextInt();
        Polinomio polinomio1 = new Polinomio(coef1, exp1);

        System.out.println("Ingrese el coeficiente del segundo polinomio: ");
        int coef2 = scanner.nextInt();
        System.out.println("Ingrese el exponente del segundo polinomio: ");
        int exp2 = scanner.nextInt();
        Polinomio polinomio2 = new Polinomio(coef2, exp2);

        int opcion = 0;
        while (opcion != 5) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Sumar polinomios");
            System.out.println("2. Restar polinomios");
            System.out.println("3. Multiplicar polinomios");
            System.out.println("4. Dividir polinomios");
            System.out.println("5. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Polinomio resultadoSuma = polinomio1.sumar(polinomio2);
                    System.out.println("El resultado de la suma es: " + resultadoSuma.getCoeficiente() + "x^" + resultadoSuma.getExponente());
                    break;
                case 2:
                    Polinomio resultadoResta = polinomio1.restar(polinomio2);
                    System.out.println("El resultado de la resta es: " + resultadoResta.getCoeficiente() + "x^" + resultadoResta.getExponente());
                    break;
                case 3:
                    Polinomio resultadoMultiplicacion = polinomio1.multiplicar(polinomio2);
                    System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion.getCoeficiente() + "x^" + resultadoMultiplicacion.getExponente());
                    break;
                case 4:
                    Polinomio resultadoDivision = polinomio1.dividir(polinomio2);
                    System.out.println("El resultado de la división es: " + resultadoDivision.getCoeficiente() + "x^" + resultadoDivision.getExponente());
                    break;
                case 5:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}


