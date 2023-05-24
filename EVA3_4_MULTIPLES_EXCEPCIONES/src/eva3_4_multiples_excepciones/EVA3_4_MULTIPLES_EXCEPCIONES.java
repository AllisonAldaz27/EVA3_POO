/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_4_multiples_excepciones;

import java.awt.BorderLayout;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA3_4_MULTIPLES_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y;
        Scanner input =new Scanner(System.in);
       try{
        System.out.println("Introduce el valor entero de x:  ");
        x=input.nextInt();
        System.out.println("Introdice el valor entero de y: ");
        y=input.nextInt();
        int resu=x/y;
        System.out.println("La division de "+ x +"/"+ y+ " es:  "+ resu);
       }catch(InputMismatchException e){
           System.out.println("La captura es incorrecta "+ e.getMessage());
       }catch(ArithmeticException e){
           System.out.println("No se pude dividir entre 0: "+e.getMessage());
       }
        
        
        System.out.println("PROGRAMA TERMINADA CON EXITO");
    }
    
}
