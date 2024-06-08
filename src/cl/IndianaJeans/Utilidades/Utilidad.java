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

    public  void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        }


    }

    public void limpiaespera() {
        espera();
        limpiarPantalla ();
    }

    public void espera() {
        int timeWait = 10;
        try {
            for(int i = 0; i < timeWait; i++) {
                Thread.sleep(150);
            }
        }catch(InterruptedException ie) {
            System.out.println("Error al trabajar tiempo de espera");
        }
    }


}
