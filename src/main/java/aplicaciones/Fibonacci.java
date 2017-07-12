/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones;

/**
 * Clase para el calculo de la serie de Fibonacci.
 *
 * @author pablo
 * @version 1.0
 */
public class Fibonacci {

    /**
     * primero primer elemento de la serie.
     */
    private int primero;
    /**
     * segundo segundo elemento de la serie.
     */
    private int segundo;
    /**
     * suma resultado de la suma dictada por la serie de fibonacci.
     */
    private int suma;
    /**
     * elementos numero de elementos a objetener.
     */
    private final int elementos;

    /**
     * Declaracion del constructor.
     * @param elementos Numero de elementos de la serie
     * @since Principal 1.0
     */
    public Fibonacci(final int elementos) {
        this.primero = 0;
        this.segundo = 1;
        this.suma = 0;
        this.elementos = elementos;
    }

    /**
     * Calculo de la serie.
     * @since Principal 1.0
     */
    public final void calcularSerie() {
        for (int i = 3; i < elementos + 3; i++) {
            primero = segundo;
            segundo = suma;
            suma = primero + segundo;
            System.out.print(suma + "  ");
        }
        System.out.println("");
    }
}
