package p2_examen1_JoseSeron;

/**
 *
 * @author claudiacortes
 */
public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado (L=" + lado + ")";
    }

}
