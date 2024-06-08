package cl.IndianaJeans.Exporta;

import cl.IndianaJeans.Modelo.Producto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Nombre del Package :cl.IndianaJeans.Modelo
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : miércoles 05 de junio de 2024
 * 05-06-2024 19:46
 * Nombre del Proyecto DesafioIndianaJeans
 * //Atributos
 * //Cojnstructo Vacio
 * //Constructor completo de la Clase
 * //Metodos
 * //Getters y Setters
 */
public class ExportadorTxt extends Exportador {

    //Constructor
    public ExportadorTxt() {
    }

    //Metodos
    @Override
    public void exportar(ArrayList<Producto> listaAexportar) {
        ArrayList<Producto> lista = listaAexportar;
        File nuevoArchivo = new File("listaDePproducto.txt");
        try {
            if (nuevoArchivo.createNewFile()) {
                System.out.println("\n");
                System.out.println("   Se ha Exportado a Archivo Correctamente!");
                File ruta1 = nuevoArchivo;
                FileWriter fileW = null;
                try {
                    fileW = new FileWriter(ruta1);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileW);
                    for (Iterator<Producto> iterador = lista.iterator(); iterador.hasNext();) {
                        String element = String.valueOf(iterador.next());
                        bufferedWriter.write(element);
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println("   No se ha podido crear el Archivo!!!");
            }
        } catch (IOException e) {
            System.out.println("   Error al Crear el archivo");
            e.printStackTrace();
        }




    }

    //Metodo para escribir en el array y el archivo
    public static void escribirArchivo(File ruta, ArrayList<Producto> lista) {
        File ruta1 = ruta;
        FileWriter fileW = null;
        try {
            fileW = new FileWriter(ruta1);
            BufferedWriter bufferedWriter = new BufferedWriter(fileW);
            for (Iterator<Producto> iterador = lista.iterator(); iterador.hasNext();) {
                String element = String.valueOf(iterador.next());
                bufferedWriter.write(element);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
