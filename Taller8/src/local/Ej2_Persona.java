
package local;

/**
 *
 * @author Daniel
 */
public class Ej2_Persona {
    protected String nombre;
    protected int edad;

    public Ej2_Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDetalles(){
        System.out.println("nombre: " + nombre + " y edad: " + edad);
    }
}
