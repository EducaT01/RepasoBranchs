/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.isii.programas;

import aplicaciones.Combinacion;
import aplicaciones.Factorial;
import aplicaciones.Fechas;
import aplicaciones.Fibonacci;
import aplicaciones.Permutacion;
import aplicaciones.Primos;
import java.util.Scanner;

/**
 * Clase ejecutable del programa.
 *
 * @author Cristhian Arevalo
 * @author Mario Catota
 * @author Pablo Guallichico
 * @version 1.0
 */
public class Principal {

    /**
     * entrada Dato que dara como resultado el ingreso del usuario.
     */
    private static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    final Primos obj1 = new Primos();
                    obj1.primos();
                    break;
                case 2:
                    try {
                        System.out.println("Ingrese el número de elementos de la serie");
                        final Fibonacci calculo = new Fibonacci(entrada.nextInt());
                        calculo.calcularSerie();
                    } catch (Exception e) {
                        System.out.println("Dato incorrecto");
                    }
                    break;
                case 3:
                    final Fechas edad = new Fechas();
                    edad.ingresarFechas();
                    edad.calculoEdad();
                    break;
                case 4:
                    try {
                        System.out.println("Ingrese el número para el calculo");
                        final Factorial calculo = new Factorial(entrada.nextInt());
                        calculo.calcular();
                    } catch (Exception e) {
                        System.out.println("Dato incorrecto");
                    }
                    break;
                case 5:
                    final Permutacion cal = new Permutacion();
                    cal.permutacion();
                    break;
                case 6:
                    final Combinacion obj = new Combinacion();
                    obj.combinacion();
                    break;
                default:
                    break;
            }
        } while (opcion != 0);
    }

    /**
     * Muestra el menu principal.
     *
     * @return Opcion elegida
     */
    public static int menu() {
        int opcion = 7;
        System.out.println("******Ingenieria de Software I***********");
        System.out.println("1. Número Primos.");
        System.out.println("2. Serie de Fibonacci.");
        System.out.println("3. Calculo de la edad.");
        System.out.println("4. Calculo del Factoial.");
        System.out.println("5. Permutaciones.");
        System.out.println("6. Combinaciones.");
        System.out.println("0. Salir.");
        System.out.print("Escoja una opción:");
        try {
            opcion = entrada.nextInt();
        } catch (Exception e) {
            System.err.println("Opcion invalida");
        }
        return opcion;
    }

}
