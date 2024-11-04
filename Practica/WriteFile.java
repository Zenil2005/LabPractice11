package mx.unam.fi.poo.g1.Practica11.WriteFile;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase para escribir en archivos.
 */
public class WriteFile {

    /**
     * Método para escribir archivos.
     * 
     * @param filename  -> El nombre del archivo en el que se escribirá el
     *                  contenido.
     * @param contenido -> El contenido que se escribirá en el archivo.
     */
    public void escribeArchivo(String filename, String contenido) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(filename, false);
            fw.write(contenido);
            fw.close();
            System.out.println("Archivo escrito exitosamente");
        } catch (IOException e) {
            System.err.println("No es posible escribir en el archivo: " + e.getMessage());
        }
    }
}
