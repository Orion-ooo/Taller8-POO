
package local;

/**
 *
 * @author Daniel
 */
public class NewMain {

    public static void main(String[] args) {
        
        //Ejercicio 2
        
        Ej2_Estudiante estudiante1 = new Ej2_Estudiante(1234, "Daniel Figueroa", 19);
        estudiante1.mostrarDetalles();
        Ej2_Estudiante estudiante2 = new Ej2_Estudiante(2341, "Oscar Obregon", 21);
        estudiante2.mostrarDetalles();
        Ej2_Estudiante estudiante3 = new Ej2_Estudiante(3412, "Andrea Arteaga", 18);
        estudiante3.mostrarDetalles();
        Ej2_Estudiante estudiante4 = new Ej2_Estudiante(4123, "Sophia Perez", 19);
        estudiante4.mostrarDetalles();
        
        //Ejercicio 3
        
        Ej3_Empleado empleado1 = new Ej3_Empleado("Andres Garcia", 1200000);
        Ej3_Gerente gerente = new Ej3_Gerente("Administracion Principal", "Daniel Figueroa", 3000000);
        
        empleado1.mostrarDetalles();
        gerente.mostrarDetalles();
    }
    
}
