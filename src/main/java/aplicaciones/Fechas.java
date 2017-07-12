
package aplicaciones;

import java.util.Scanner;

/**
 * Clase para calcular la edad entre dos fechas.
 *
 * @author Pablo Guallichico
 * @version 1.0
 */
public class Fechas {

    /**
     * diaInicial Variable ingresada por el usuario, que indica el dia inicial.
     */
    private int diaInicial;
    /**
     * mesInicial Variable ingresada por el usuario, que indica el mes inicial.
     */
    private int mesInicial;
    /**
     * anioInicial Variable ingresada por el usuario, que indica el anio
     * inicial.
     */
    private int anioInicial;
    /**
     * diaFinal Variable ingresada por el usuario, que indica el dia final.
     */
    private int diaFinal;
    /**
     * mesFinal Variable ingresada por el usuario, que indica el mes final.
     */
    private int mesFinal;
    /**
     * anioFinal Variable ingresada por el usuario, que indica el anio final.
     */
    private int anioFinal;

    /**
     * Declaracion del constructor.
     *
     * @since Principal 1.0
     */
    public Fechas() {
    }

    /**
     * Metodo para restar dos fechas e imprimir el reesultado.
     *
     * @since Principal 1.0
     */
    public final void calculoEdad() {
        final int dia = 0;
        int dias = 0;
        int anios = 0;
        int meses = 0;

        validarMeses(mesInicial - 1);
        if ((anioInicial > anioFinal) || (anioInicial == anioFinal && mesInicial > mesFinal)
                || (anioInicial == anioFinal && mesInicial == mesFinal && diaInicial > diaFinal)) {
            System.out.println("Las fechas ingresadas son incorrectas");
        } else {
            if (mesInicial <= mesFinal) {
                anios = anioFinal - anioInicial;
                if (diaInicial <= diaFinal) {
                    meses = mesFinal - mesInicial;
                    dias = dia - (diaInicial - diaFinal);
                } else {
                    if (mesFinal == mesInicial) {
                        anios = anios - 1;
                    }
                    meses = (mesFinal - mesInicial - 1 + 12) % 12;
                    dias = dia - (diaInicial - diaFinal);
                }
            } else {
                anios = anioFinal - anioInicial - 1;
                System.out.println(anios);
                if (diaInicial > diaFinal) {
                    meses = mesFinal - mesInicial - 1 + 12;
                    dias = dia - (diaInicial - diaFinal);
                } else {
                    meses = mesFinal - mesInicial + 12;
                    dias = diaFinal - diaInicial;
                }
            }
        }

        System.out.print("");
        System.out.print("La edad es: ");
        System.out.println("Años: " + anios);
        System.out.println("Meses: " + meses);
        System.out.println("Días: " + dias);
    }
    
    /**
     * Declaracion del constructor.
     * @param mes Es el argumento que recibira la funcion para validar el mes
     * @return dia
     * @since Principal 1.0
     */
    public final int validarMeses(final int mes) {
        int dia = 0;
        if (mes == 2) {
            if ((anioFinal % 4 == 0) && ((anioFinal % 100 != 0) || (anioFinal % 400 == 0))) {
                dia = 29;
            } else {
                dia = 28;
            }
        } else if (mes <= 7) {
            if (mes == 0) {
                dia = 31;
            } else if (mes % 2 == 0) {
                dia = 30;
            } else {
                dia = 31;
            }
        } else if (mes > 7) {
            if (mes % 2 == 0) {
                dia = 31;
            } else {
                dia = 30;
            }
        }
        return dia;
    }

    /**
     * Metodo para ingresar las fechas.
     *
     * @since Principal 1.0
     */
    public final void ingresarFechas() {
        System.out.print("Ingrese el dia inicial: ");
        diaInicial = validarNumero();
        System.out.print("Ingrese el mes Inicial: ");
        mesInicial = validarNumero();
        System.out.print("Ingrese el año Inicial :");
        anioInicial = validarNumero();
        System.out.print("Ingrese el dia final: ");
        diaFinal = validarNumero();
        System.out.print("Ingrese el mes final: ");
        mesFinal = validarNumero();
        System.out.print("Ingrese el año final: ");
        anioFinal = validarNumero();
    }

    /**
     * Metodo validar que el dato ingresado sea un numero entero.
     *
     * @return Numero entero
     * @since Principal 1.0
     */
    public final int validarNumero() {
        final Scanner entrada = new Scanner(System.in);
        int valor = 0;
        try {
            valor = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("Valor invalido");
        }
        return valor;
    }
}
