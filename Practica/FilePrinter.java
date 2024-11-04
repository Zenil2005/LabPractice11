package mx.unam.fi.poo.g1.Practica11.FilePrinter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Clase para imprimir el contenido de un archivo
 */
public class FilePrinter {
    private String strLine;
    private String str_data;

    /**
     * Constructor de FilePrinter. Inicializa strLine y str_data en cadenas vacías.
     */
    public FilePrinter() {
        setStrLine("");
        setStr_Data("");
    }

    /**
     * Método set.
     * Establece la variable strLine.
     * 
     * @param strLine -> La línea leída del archivo.
     */
    public void setStrLine(String strLine) {
        this.strLine = strLine;
    }

    /**
     * Obtiene el valor de strLine.
     * 
     * @return -> La línea actual leída del archivo.
     */
    public String getStrLine() {
        return this.strLine;
    }

    /**
     * Establece la variable str_data.
     * 
     * @param str_data -> Los datos acumulados leídos del archivo.
     */
    public void setStr_Data(String str_data) {
        this.str_data = str_data;
    }

    /**
     * Obtiene el valor de str_data.
     * 
     * @return -> Los datos acumulados leídos del archivo.
     */
    public String getStr_Data() {
        return this.str_data;
    }

    /**
     * Lee un archivo y muestra su contenido.
     * 
     * @param filename -> El nombre del archivo a leer.
     */
    public void imprimeArchivo(String filename) {
        setStrLine("");
        setStr_Data("");

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            while ((strLine = br.readLine()) != null) {
                sb.append(strLine);
                sb.append(System.lineSeparator());
            }
            str_data = sb.toString();
            br.close();
            System.out.println(str_data);
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + filename);
        } catch (IOException e) {
            System.err.println("No es posible leer el archivo: " + filename);
        }
    }
}
