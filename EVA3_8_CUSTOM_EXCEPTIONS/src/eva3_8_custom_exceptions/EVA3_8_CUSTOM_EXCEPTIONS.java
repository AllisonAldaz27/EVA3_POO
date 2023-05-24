/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_custom_exceptions;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA3_8_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso =new Persona("maria","martinez",-10);
        perso.setNombre("MARTA");
        perso.setApellido("MARTINEZ");
        try{
        perso.setEdad(-7);
    }catch(DatoEntradaCheckedException e){
            System.out.println( e.getMessage());
    }
    }
    
}
class Persona{
    private String apellido;
    private String nombre;
    private int edad;

    public Persona() {
         this.apellido = "";
        this.nombre = "";
        this.edad = 0;
    }

    
    public Persona(String apellido, String nombre, int edad) {
        this.apellido = apellido;
        this.nombre = nombre;
       this.edad= edad;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws DatoEntradaCheckedException {
        if(edad<0)
           // throw new DatoEntradaException();
        throw new DatoEntradaCheckedException();
        this.edad = edad;
    }
    
}
class DatoEntradaException extends RuntimeException{

    public DatoEntradaException() {
        super("DATO DE ENTRADA INCORRECTO!! SU VALOR DEBE SER POSITIVO.");
    }
    
}
class DatoEntradaCheckedException extends Exception{

    public DatoEntradaCheckedException() {
        super("DATO DE ENTRADA INCORRECTO!! SU VALOR DEBE SER POSITIVO.");
    }
    
}