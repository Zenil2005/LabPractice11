package mx.unam.fi.poo.g1.Practica11.Practica11;

import mx.unam.fi.poo.g1.Practica11.FilePrinter.FilePrinter;
import mx.unam.fi.poo.g1.Practica11.WriteFile.WriteFile;

/**
 * Clase principal del Proyecto 1
 * 
 * @author Grupo 1 de POO
 * @version Noviembre de 2024
 */

public class Practica11 {

    /**
     * Metodo main
     * Se ejecuta todo el funcionamiento de la aplicación
     * 
     * @param args -> Arreglo por defecto del metodo main
     */
    public static void main(String[] args) {

        FilePrinter filePrinter = new FilePrinter();
        WriteFile writeFile = new WriteFile();

        String archivo1 = "/mnt/c/Users/lzeni/OneDrive/Documentos/GitHub/LabPractice11/Practica/Archivos/archivo1.txt";
        String archivo2 = "/mnt/c/Users/lzeni/OneDrive/Documentos/GitHub/LabPractice11/Practica/Archivos/archivo2.txt";
        String archivo3 = "/mnt/c/Users/lzeni/OneDrive/Documentos/GitHub/LabPractice11/Practica/Archivos/archivo3.txt";

        filePrinter.imprimeArchivo(archivo1);
        String contenido1 = filePrinter.getStr_Data();

        filePrinter.imprimeArchivo(archivo2);
        String contenido2 = filePrinter.getStr_Data();

        filePrinter.imprimeArchivo(archivo3);
        String contenido3 = filePrinter.getStr_Data();

        String compendio = contenido1 + contenido2 + contenido3;

        String archivoDestino = "/mnt/c/Users/lzeni/OneDrive/Documentos/GitHub/LabPractice11/Practica/Archivos/archivoDestino.txt";
        writeFile.escribeArchivo(archivoDestino, compendio);

        System.out.println("Se han combinado los contenidos y escrito en archivoDestino.txt");
        System.out.println("El contenido del archivo destino es: ");

        filePrinter.imprimeArchivo(archivoDestino);
    }
}
