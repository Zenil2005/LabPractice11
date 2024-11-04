import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
            String filename = "/mnt/c/Users/lzeni/OneDrive/Documentos/GitHub/LabPractice11/Practica/Archivos/miarchivo.txt";
            FileWriter fw = new FileWriter(filename, false);
            fw.write("Me la estoy pasando bien raro...\n");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader(
                    "/mnt/c/Users/lzeni/OneDrive/Documentos/GitHub/LabPractice11/Practica/Archivos/miarchivo.txt"));
            while (strLine != null) {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        } catch (IOException e) {
            System.err.println("IOException" + e.getMessage());
        }
    }
}
