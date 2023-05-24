/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_unchecked_exceptions;

import java.util.Scanner;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA3_1_UNCHECKED_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARITHMETIC EXCEPTIN:
        //DIVISON ENTRE CERO
        System.out.println("INICIANDO EL PROGRAMA");
        int x = 5, y = 0;
        System.out.println("INICIALIZANDO LAS VARIABLES");
        int resu = x / y;
        System.out.println("CALCULANDO LA DIVISION");
        System.out.println("Divison= " + resu);
        //INPUTMISMATCH EXCEPTION : ERROR DE CAPTURA DE DATOS 
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numer = input.nextInt();
        System.out.println("Tu numero es : " + numer);
        //INDEXOUTOFBOUNDS EXCEPTION
        int[] arreglo = new int[5];//0-(N-1)
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;    //EROOR DE LOGICA:el 5 no es una posicion valida  

        //NULLPOINTER EXCEPTION
        Prueba objPrueba = null;
        System.out.println("Valor de x = " + objPrueba);
    }

}

class Prueba {

    public int x = 100;

}
