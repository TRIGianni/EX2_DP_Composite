package be.heh.composite.prjmagasin;

import org.junit.Test;

import javax.crypto.Mac;

import static org.junit.Assert.*;

public class MagasinTest {
    @Test
    public void calculBeneficeUnMagasin() {
        double benefice = 20.0;
        Magasin magasin = new Magasin(benefice);
        double benef = magasin.calculBenefice();

        assertEquals(20.0, benef,0.01);
    }

    @Test
    public void calculBenefParVille() {
    Composite villeMons = new Composite();
    Magasin ikea = new Magasin(100000);
    Magasin krefel = new Magasin(220000);
    villeMons.add(ikea);
    villeMons.add(krefel);
    double benef = villeMons.calculBenefice();

    assertEquals(320000.0, benef,0.01);

    }

    @Test
    public void calculBenefParProvince() {

        Composite provinceHainaut = new Composite();
        Composite villeMons = new Composite();
        Composite villeQuaregnon = new Composite();
        Magasin ikea = new Magasin(100000);
        Magasin krefel = new Magasin(220000);
        Magasin delhaize = new Magasin(100000);
        Magasin weba = new Magasin(220000);

        villeMons.add(ikea);
        villeMons.add(krefel);
        villeQuaregnon.add(delhaize);
        villeQuaregnon.add(weba);

        provinceHainaut.add(villeQuaregnon);
        provinceHainaut.add(villeMons);

        double benef;
        benef = provinceHainaut.calculBenefice();

        assertEquals(640000.0, benef,0.01);
    }
}