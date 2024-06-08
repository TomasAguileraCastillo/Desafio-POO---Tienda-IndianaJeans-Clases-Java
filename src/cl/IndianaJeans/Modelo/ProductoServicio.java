package cl.IndianaJeans.Modelo;

import cl.IndianaJeans.Utilidades.Menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Nombre del Package :cl.IndianaJeans.Modelo
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : miércoles 05 de junio de 2024
 * 05-06-2024 19:39
 * Nombre del Proyecto DesafioIndianaJeans

 *
 * //Getters y Setters
 */
public class ProductoServicio {

// Atributos
    private ArrayList<Producto> listaProductos = new ArrayList<>();

    //Constructor Vacio

    public ProductoServicio() {
    }
    //Constructor Completo


    public ProductoServicio(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }



    //Metodos

    public void listarProductos(){

        if (listaProductos.isEmpty()) {
            System.out.println("\n");
            System.out.println("   no hay datos a listar ");
        }else {
        //Estructura foreach
        for (Producto producto : listaProductos) {
            System.out.println("  **Listado del Producto** ");
            System.out.println("\n");
            System.out.println("      Articulo : " + producto.getArticulo());
            System.out.println("      Precio : " + producto.getPrecio());
            System.out.println("      Descripcion : " + producto.getDescripcion());
            System.out.println("      Codigo : " + producto.getCodigo());
            System.out.println("      Talla : " + producto.getTalla());
            System.out.println("      Marca : " + producto.getMarca());
            System.out.println("      Color : " + producto.getColor());
        }

        }

    }
    public void agregarProductos(String artic, String prec, String descr,
                                 String codi, String tall, String marc, String col) {

        Producto product = new Producto(artic,prec, descr, codi, tall, marc, col);

        if (product == null) {

            System.out.println("\n");
            System.out.println("   no es posible agregar producto");

        }else {
            listaProductos.add(product);
            System.out.println("\n");
            System.out.println("   Listado agregado correctamente ");
        }



    }


    //Getters y Setters


    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}

