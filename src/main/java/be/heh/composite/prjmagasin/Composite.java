package be.heh.composite.prjmagasin;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Composant {

    protected List<Composant> composants = new ArrayList<>();

    @Override
    public double calculBenefice() {
        double beneficeTotal = 0;
        for(Composant c : composants){
            beneficeTotal += c.calculBenefice();
        }
        return beneficeTotal;
    }

    @Override
    public void add(Composant c) {
        composants.add(c);
    }
}
