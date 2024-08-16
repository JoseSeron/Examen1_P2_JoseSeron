package p2_examen1_JoseSeron;

/**
 *
 * @author claudiacortes
 */
public abstract class Figura {

    /*NOTA: esta clase no necesita ningun atributo
    El método calcularArea DEBE ser abstracto*/
    abstract double calcularArea();

    @Override
    public String toString() {
        return "Figura{" + '}';
    }

}
