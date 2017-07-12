/*
*esta una modificacion en el master
*este branch es el master
*/
package aplicaciones;

import java.util.Scanner;

/**
 * Clase para el calculo de Combinaciones.
 *
 * @author Cristhian Arevalo
 * @version 1.0
 */
public final class Combinacion {

    /**
     * Metodo para el ingreso de los datos.
     */
    public void combinacion() {
        /**
         * @param dato instancia de scanner para ingreso de datos.
         * @param num1 numero de elementos 
         * @param num2 numero de grupos
         */
        final Scanner dato = new Scanner(System.in);
        int num1, num2;
        System.out.print("Ingrese el numero de elementos de la seleccion : ");
        num1 = dato.nextInt();
        System.out.print("Ingrese el numero de elementos elegidos : ");
        num2 = dato.nextInt();
        final int[] arreglo = new int[num1];
        ciclos(0, num1, arreglo, num2);
    }
    /**
     * @param ciclo 
     * @param limite numero de elementos 
     * @param arreglo 
     * @param num2 numero de grupos
     */
    public void ciclos(final int ciclo,final int limite,final  int[] arreglo,final int num2) {
        for (int i = 0; i < num2; i++) {
            arreglo[ciclo] = i + 1;
            if (ciclo == limite - 1) {
                for (int j = 0; j < arreglo.length; j++) {
                    System.out.print(arreglo[j] + " ");
                }
                System.out.println("");
            } else {
                ciclos(ciclo + 1, limite, arreglo, num2);
            }
        }
    }
}
