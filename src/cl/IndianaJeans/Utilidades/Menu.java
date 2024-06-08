package cl.IndianaJeans.Utilidades;
import cl.IndianaJeans.Exporta.Exportador;
import cl.IndianaJeans.Exporta.ExportadorTxt;
import cl.IndianaJeans.Modelo.Producto;
import cl.IndianaJeans.Modelo.ProductoServicio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Nombre del Package :cl.IndianaJeans.Modelo
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : miércoles 05 de junio de 2024
 * 05-06-2024 19:47
 * Nombre del Proyecto DesafioIndianaJeans
 */
public class Menu {

    Scanner sc = new Scanner(System.in);
    ProductoServicio productoServic = new ProductoServicio();
    ArrayList<String> datos =new ArrayList<>();
    ExportadorTxt exportadorTxt = new ExportadorTxt();
    Utilidad utilidad = new Utilidad();


    //Metodos
    public void menuOpciones(){
        int op;

        do {
                utilidad.limpiarPantalla();
                System.out.println("\n");
                System.out.println(" **  Menu de Opciones ** ");
                System.out.println("\n");
                System.out.println(" 1_ Listar Producto");
                System.out.println(" 2_ Agregar Producto");
                System.out.println(" 3_ Exportar Datos  ");
                System.out.println(" 4_ Salir           ");
                System.out.print("\n");
                System.out.print("   Ingrese una Opcion : ");
                op = sc.nextInt();
                System.out.println("\n");
                    if (op == 1) { //listar
                        utilidad.limpiarPantalla();
                        listar();
                        } else if (op == 2) {//agregar
                        utilidad.limpiarPantalla();
                        agregar();
                        } else if (op == 3) {//exportar
                        exportar();
                    } else if (op == 4) {//salir
                        System.out.println("Se ha terminado el programa");
                        utilidad.limpiaespera();
                        System.exit(0);
                    }else{
                        System.out.println("Debe ingresar opcion del 1 al 4");
                    }
        } while (op>=1 && op <=4 );
    }


    public void listar(){
        productoServic.listarProductos();
        utilidad.limpiaespera();

    }

    public void agregar(){


            System.out.println("  **Agregar Producto** ");
            System.out.print("\n");
            System.out.println("Ingrese Nombre del Articulo : ");
            String artic = sc.next();
            System.out.println("Ingrese Precio : ");
            String prec = sc.next();
            System.out.println("Ingrese Descripcion : ");
            String descr = sc.next();
            System.out.println("Ingrese Codigo : ");
            String codi = sc.next();
            System.out.println("Ingrese Talla : ");
            String tall = sc.next();
            System.out.println("Ingrese Marca : ");
            String marc = sc.next();
            System.out.println("Ingrese Color: ");
            String col = sc.next();
            productoServic.agregarProductos(artic, prec, descr, codi, tall, marc, col);
            utilidad.limpiaespera();


    }

    public void exportar(){
        ArrayList<Producto> pro = productoServic.getListaProductos();
        exportadorTxt.exportar(pro);
        utilidad.limpiaespera();
    }





}
