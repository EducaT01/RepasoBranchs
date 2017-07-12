/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones;

import java.util.Scanner;

/**
 * Clase para el calculo de los n numeros primos.
 * @author Cristhian Arevalo
 * @version 1.0
 */
public class Primos {
    /**
     * Funcion para el ingreso de los datos.
     */
    public final void primos(){
       
        final Scanner dato = new Scanner(System.in);
        int numero;
        System.out.print("ingrese el numero de n primos : ");
        numero=dato.nextInt();
        imprimir(numero);
    }
    /**
     * Funcion para el calculo de los numeros primos
     * y su impresion por pantalla.
     * @param numero Numero limite para el calculo de primos.
     */
    public final void imprimir(final int numero){
       int cont;
        for(int i=1;i<numero;i++){
            cont=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    cont++;
                }
            }
                if(cont==2){
                    System.out.print(i+" ");
            }
        }
        System.out.println("");
    }
}
