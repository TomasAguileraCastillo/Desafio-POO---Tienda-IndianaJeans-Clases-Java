package cl.IndianaJeans.Utilidades;

/**
 * Nombre del Package :cl.IndianaJeans.Modelo
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : miércoles 05 de junio de 2024
 * 05-06-2024 19:49
 * Nombre del Proyecto DesafioIndianaJeans
 * //Atributos
 * //Cojnstructo Vacio
 * //Constructor completo de la Clase
 * //Metodos
 * //Getters y Setters
 */
public class Utilidad {
    //Constructor

    public Utilidad() {
    }


    //Metodo

    public void espera() {
        int tiempoEspera = 15;
        try {
            for(int i = 0; i < tiempoEspera; i++) {
                Thread.sleep(150);
            }
        }catch(InterruptedException ie) {
            System.out.println("Error en timer");
        }
    }

    public  void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {

        }
    }

    public void limpiaespera() {
        espera();
        limpiarPantalla ();
    }



}
