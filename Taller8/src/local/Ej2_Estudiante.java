
package local;

/**
 *
 * @author Daniel
 */
public class Ej2_Estudiante extends Ej2_Persona{
    private int matricula;

    public Ej2_Estudiante(int matricula, String nombre, int edad) {
        super(nombre, edad);
        this.matricula = matricula;
    }
    
    @Override public void mostrarDetalles(){
        System.out.println("nombre: " + nombre + " y edad: " + edad);
        System.out.println("matricula con numero: " + matricula);
    }
}
