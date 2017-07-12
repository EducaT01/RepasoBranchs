/**
 * Cambios en la rama de hotfix
 */
package aplicaciones;

/**
 * Clase para calcular el factorial de n numeros.
 * @author Pablo Guallichico
 * @version 1.0
 */
public class Factorial {
    /**
     *  repeticiones Es la variable que ingresa el usuario.
     */
    private final int repeticiones;
    /**
     * resultado Es la variable que almacenara la respuesta del factorial.
     */    
    private int resultado;

    
    /**
     * Declaracion del constructor.
     * @param repeticiones Es el argumento para el calculo del factorial
     * @since Principal 1.0
     */
    public Factorial(final int repeticiones) {
        this.repeticiones = repeticiones;
        this.resultado = 1;
    }
    
    /**
     * Metodo para calcula el factorial e imprime el resultado.
     * @since Principal 1.0
     */
    public final void calcular(){
        for(int i = 1; i <= repeticiones; i++){
            resultado *= i;   
        }
        System.out.println("Factorial de " + repeticiones + " = " + resultado);
    }
}
