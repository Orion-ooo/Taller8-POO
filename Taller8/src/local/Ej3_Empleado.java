
package local;

/**
 *
 * @author Daniel
 */
public class Ej3_Empleado {
    protected String nombre;
    protected double salario;

    public Ej3_Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public void mostrarDetalles(){
        System.out.println("nombre: " + nombre + " y salario: " + salario);
    }
}
