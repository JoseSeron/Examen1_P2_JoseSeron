
package p2_examen1_JoseSeron;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class FiguraCompuesta extends Figura {
    private ArrayList<Figura> figuras = new ArrayList<>();

    @Override
    double calcularArea() {
        double areaTotal = 0;
        for (Figura figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        return areaTotal;
    }
    
    

}
