package p2_examen1_JoseSeron;

/**
 *
 * @author joser
 */
public class Circulo extends Figura {

    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return 3.1216 * (radio * radio);
    }

    @Override
    public String toString() {
        return "Circulo (R=" + radio + ")";
    }

}
