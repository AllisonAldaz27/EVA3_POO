/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_throw_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA3_7_THROW_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Prueba obj=new Prueba();
        try {
            //checked: es forzoso atenderlas
            //uncheked:errores de logica,no es forzoso resolverlas
            //int resu=5/0;
            obj.capturaMayorCero(89);
            Scanner inout=new Scanner(System.in);
            int valor =input.nextInt();
        } catch (Exception ex) {
            //no es bueno usar exception,ya que es la super clase de las exceptiones
           //va a capturar cualquier exception 
             System.out.println(ex.getMessage());
        }
      
        //Arithmetic exception es uncheked y no es obligatoria
        //capturar unchecked 
        obj.division(100, 0);
    }
    
}
class Prueba{
    //EXCEPTION ES CHECKED EXCEPTION,ESTAMOS OBLIGADOS A ATENDERLE
    public void capturaMayorCero(int valor) throws Exception{
        if (valor<=0) {//voy a generar una excepcion
            throw new Exception(valor   + "ES NEGATIVO,SOLO SE ACEPTAN NUMEROS POSITUVOS");
        }
        System.out.println("El valor es:   "+ valor);
        
    }
    public int division(int x,int y) throws ArithmeticException{
        if(y==0)
            throw new ArithmeticException("EL VALOR DEL DIVISOR ES CERO Y ES INVALIDO");
        return x/y;
    }
            
}