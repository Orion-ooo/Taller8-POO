
package local;

/**
 *
 * @author Daniel
 */
public class Ej1_Vehiculo {
    protected String marca;
    protected double velocidadMax;

    public Ej1_Vehiculo(String marca, double velocidadMax) {
        this.marca = marca;
        this.velocidadMax = velocidadMax;
    }
    
    public void mostrarInfo(){
        System.out.println("marca: " + marca + " y velocidad maxima: " + velocidadMax);
    }
}
