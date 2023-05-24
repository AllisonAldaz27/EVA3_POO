/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_9_leer_archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA3_9_LEER_ARCHIVOS {
    final static String RUTA="C:\\ARCHIVOS\\PRUEBA.txt\\";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        // TODO code application logic here
            readUsingFiles(RUTA);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    /*
    FILES:se lee todo el contenido del archivo y se trasnfiere a memoria principal (RAM)
    util con archivos pequeños.
    */
    public static void readUsingFiles(String ruta) throws IOException{
        //CONSTRUIMOS LA RUTA EN BASE A LA CADENA DE TEXTO
       Path path=Paths.get(ruta);
       List<String> todaslaslineas= Files.readAllLines(path);
        System.out.println("RESULTADO");
       // System.out.println(todaslaslineas.toString());
        for (int i = 0; i < todaslaslineas.size(); i++) {
            System.out.println(todaslaslineas.get(i));
            
        }
    }
    
}
