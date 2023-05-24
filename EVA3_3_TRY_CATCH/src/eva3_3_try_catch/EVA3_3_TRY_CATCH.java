/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_try_catch;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA3_3_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=5,y=0;
        try{
            //seccion de codigo poterncialmente genera una exception
        int resu=x/y;
        System.out.println("El resultado es = "+ resu);
        }catch(ArithmeticException e){
            //se genera un objeto exception llamado"e"
            System.out.println("Excepcion:   "  +e.getMessage());
        }
        System.out.println("FIN");
    }
    
}
