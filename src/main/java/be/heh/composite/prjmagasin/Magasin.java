package be.heh.composite.prjmagasin;

public class Magasin implements Composant {
    protected double benefice;

    public Magasin(double benefice) {
        this.benefice = benefice;
    }

    @Override
    public double calculBenefice() {
        return this.benefice;
    }

    @Override
    public void add(Composant c) {

    }
}
