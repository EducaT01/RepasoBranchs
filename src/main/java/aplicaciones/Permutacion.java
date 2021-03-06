
package aplicaciones;

import java.util.Scanner;

/**
 * Clase para el calculo de Combinaciones.
 * Edito esto para ver como funcan las branches.
 * tengo q recordar cambiar de branches.
 * @author Cristhian Arevalo
 * @version 1.0
 */
public final class Permutacion {

    /**
     * Metodo para el ingreso de los datos.
     */
    public void permutacion() {
        /**
         * @param teclado instancia de scanner para ingreso de datos
         */
        final Scanner tecaldo = new Scanner(System.in);
        /**
         * @param num1 numero de elementos
         * @param num2 numero de grupos
         */
        int num1, num2;
        System.out.print("Ingrese el numero de elementos :");
        num1 = tecaldo.nextInt();
        System.out.print("Ingrese un numero de permutaciones:");
        num2 = tecaldo.nextInt();
        String[] dato = new String[num1];
        for (int i = 0; i < num1; i++) {
            dato[i] = String.valueOf(i + 1);
        }
        permuta(dato, " ", num2, num1);
    }

    /**
     * @param elem elementos de la permutacion
     * @param caracter caracte de validacion
     * @param num2 numero de grupos
     * @param num1 numero de elementos
     */
    private static void permuta(final String[] elem, final String caracter, final int num2, final int num1) {
        if (num2 == 0) {
            System.out.println(caracter);
        } else {
            for (int i = 0; i < num1; i++) {
                if (!caracter.contains(elem[i])) {
                    permuta(elem, caracter + elem[i] + " ", num2 - 1, num1);
                }
            }
        }
    }
}
