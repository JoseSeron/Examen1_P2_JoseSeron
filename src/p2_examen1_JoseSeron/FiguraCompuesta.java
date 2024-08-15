
package p2_examen1_JoseSeron;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class FiguraCompuesta extends Figura {
    private ArrayList<Figura> figuras = new ArrayList<>();

    void agregarFigura(Figura nuevaFigura){
    figuras.add(nuevaFigura);
    }
    
    @Override
    double calcularArea() {
        double areaTotal = 0;
        for (Figura figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        return areaTotal;
    }

    @Override
    public String toString() {
        String lista="Figura Compuesta:\n";
        for (Figura figura : figuras) {
            lista.concat("   ->");
            lista.concat(figura.toString());
            lista.concat("\n");
        }
        return lista;
    }
    
    

}
