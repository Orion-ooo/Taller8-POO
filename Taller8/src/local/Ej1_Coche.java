
package local;

/**
 *
 * @author Daniel
 */
public class Ej1_Coche extends Ej1_Vehiculo{
    private int numPuertas;

    public Ej1_Coche(int numPuertas, String marca, double velocidadMax) {
        super(marca, velocidadMax);
        this.numPuertas = numPuertas;
    }
    
    @Override public void mostrarInfo(){
        System.out.println("marca: " + marca + ", velocidad maxima: " + velocidadMax + " y numero de puertas: " + numPuertas);
    }
}
