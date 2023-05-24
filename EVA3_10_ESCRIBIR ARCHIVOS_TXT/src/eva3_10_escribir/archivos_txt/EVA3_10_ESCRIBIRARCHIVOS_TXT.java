/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_escribir.archivos_txt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA3_10_ESCRIBIRARCHIVOS_TXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "C:\\ARCHIVOS\\";
        try {
            writeUsingFiles(ruta + "archivoFiles.txt", "PRUEBA DE ARCHIVO \n"
                    + "USANDO LA CLASE FILES");
            writeUsingFileWriter(ruta + "archivoFileWriter.txt", "PRUEBA DE ARCHIVO \n"
                    + "USANDO LA CLASE FILESWRITTER");
            writeUsingBufferedWriter(ruta + "archivo bufferedWriter.txt", "PRUEBA DE bufferedWritter \n"
                    + "USANDO LA CLASE BUFFER");
        } catch (IOException ex) {
            
        }
    }

    public static void writeUsingFiles(String ruta, String datos) throws IOException {
        Path path = Paths.get(ruta);
        Files.write(path, datos.getBytes());
    }

    public static void writeUsingFilesWriter(String ruta, String datos) throws IOException {
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(datos);
        fileWriter.close();
    }
    public static void writeUsingBufferedWriter(String ruta,String datos) throws IOException{
           File file = new File(ruta);
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufWriter=new BufferedWriter(fileWriter);
        for (int i = 0; i < 10; i++) {
            bufWriter.write(datos);
            
        }
        bufWriter.close();
        fileWriter.close();
    }

    private static void writeUsingFileWriter(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
