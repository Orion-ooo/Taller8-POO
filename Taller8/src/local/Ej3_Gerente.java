
package local;

/**
 *
 * @author Daniel
 */
public class Ej3_Gerente extends Ej3_Empleado{
    private String departamento;

    public Ej3_Gerente(String departameto, String nombre, double salario) {
        super(nombre, salario);
        this.departamento = departameto;
    }
    
    @Override public void mostrarDetalles(){
        System.out.println("nombre: " + nombre + " y salario: " + salario);
        System.out.println("departamento asignado a: " + nombre + ": " + departamento);
    }
}
