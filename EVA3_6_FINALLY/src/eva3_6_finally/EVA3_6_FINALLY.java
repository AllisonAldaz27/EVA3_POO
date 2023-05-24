/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_6_finally;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA3_6_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 9, y = 0;
        try {
            int resu = x / y;

            System.out.println("RESULTADO:  " + resu);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre cero");
        } finally {//obliga a la ejecucion de esta seccion de codigo
            System.out.println("SIEMPRE ME VOY A EJECUTAR !!!!!!!");
        }
        System.out.println("TERMINA EL PROGRAMA");
    }

}
