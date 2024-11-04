import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        String strLine = "";
        String str_data = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(
                    "/mnt/c/Users/lzeni/OneDrive/Escritorio/Proyectos personales/java/Practica11/test.txt"));
            while (strLine != null) {
                if (strLine == null)
                    break;
                str_data += strLine;
                strLine = br.readLine();
            }
            System.out.println(str_data);
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado...");
        } catch (IOException e) {
            System.err.println("No es posible leer el archivo...");
        }
    }
}
