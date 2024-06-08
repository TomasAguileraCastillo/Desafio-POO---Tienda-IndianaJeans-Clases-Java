package cl.IndianaJeans.Exporta;

import cl.IndianaJeans.Modelo.Producto;

import java.util.ArrayList;

/**
 * Nombre del Package :cl.IndianaJeans.Modelo
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : miércoles 05 de junio de 2024
 * 05-06-2024 19:43
 * Nombre del Proyecto DesafioIndianaJeans
 */
public abstract class Exportador {
    //Atributos

    //Constructor Vacio

    public Exportador() {
    }
    //Metodo

    public abstract void exportar(ArrayList<Producto> listaAExportar);

    //Getters y Setters

}
