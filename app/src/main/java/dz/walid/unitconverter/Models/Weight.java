package dz.walid.unitconverter.Models;

/**
 * Created by Walid on 26/04/2021.
 */
public class Weight {
    //Attributs
    private double mg;
    private double cg;
    private double dg;
    private double g;
    private double dag;
    private double hg;
    private double kg;

    //Setters
    public void setMg(double mg) { this.mg = mg;}
    public void setCg(double cg) { this.cg = cg;}
    public void setDg(double dg) { this.dg = dg;}
    public void setG(double g) { this.g = g;}
    public void setDag(double dag) { this.dag = dag;}
    public void setHg(double hg) { this.hg = hg;}
    public void setKg(double kg) { this.kg = kg;}

    //Getters
    public double getMg() {return this.mg;}
    public double getCg() {return this.cg;}
    public double getDg() {return this.dg;}
    public double getG() {return this.g;}
    public double getDag() {return this.dag;}
    public double getHg() {return this.hg;}
    public double getKg() {return this.kg;}

    //Fonctions de conversions

    //Du mg vers autres
    public void MgToCg(double mg) { this.cg = mg * 0.1; }
    public void MgToDg(double mg) { this.dg = mg * 0.01; }
    public void MgToG(double mg) { this.g = mg * 0.001; }
    public void MgToDag(double mg) { this.dag = mg * 0.0001; }
    public void MgToHg(double mg) { this.hg = mg * 0.00001; }
    public void MgToKg(double mg) { this.kg = mg * 0.000001; }

    //Du cg vers autres
    public void CgToMg(double cg) { this.mg = cg * 10; }
    public void CgToDg(double cg) { this.dg = cg * 0.1; }
    public void CgToG(double cg) { this.g = cg * 0.01; }
    public void CgToDag(double cg) { this.dag = cg * 0.001; }
    public void CgToHg(double cg) { this.hg = cg * 0.0001; }
    public void CgToKg(double cg) { this.kg = cg * 0.00001; }

    //Du dg vers autres
    public void DgToMg(double dg) { this.mg = dg * 100; }
    public void DgToCg(double dg) { this.cg = dg * 10; }
    public void DgToG(double dg) { this.g = dg * 0.1; }
    public void DgToDag(double dg) { this.dag = dg * 0.01; }
    public void DgToHg(double dg) { this.hg = dg * 0.001; }
    public void DgToKg(double dg) { this.kg = dg * 0.0001; }

    //Du G vers autres
    public void GToMg(double g) { this.mg = g * 1000; }
    public void GToCg(double g) { this.cg = g * 100; }
    public void GToDg(double g) { this.dg = g * 10; }
    public void GToDag(double g) { this.dag = g * 0.1; }
    public void GToHg(double g) { this.hg = g * 0.01; }
    public void GToKg(double g) { this.kg = g * 0.001; }

    //Du Dag vers autres
    public void DagToMg(double dag) { this.mg = dag * 10000; }
    public void DagToCg(double dag) { this.cg = dag * 1000; }
    public void DagToDg(double dag) { this.dg = dag * 100; }
    public void DagToG(double dag) { this.g = dag * 10; }
    public void DagToHg(double dag) { this.hg = dag * 0.1; }
    public void DagToKg(double dag) { this.kg = dag * 0.01; }

    //Du Hg vers autres
    public void HgToMg(double hg) { this.mg = hg * 100000; }
    public void HgToCg(double hg) { this.cg = hg * 10000; }
    public void HgToDg(double hg) { this.dg = hg * 1000; }
    public void HgToG(double hg) { this.g = hg * 100; }
    public void HgToDag(double hg) { this.dag = hg * 10; }
    public void HgToKg(double hg) { this.kg = hg * 0.1; }

    //Du Kg vers autres
    public void KgToMg(double kg) { this.mg = kg * 1000000; }
    public void KgToCg(double kg) { this.cg = kg * 100000; }
    public void KgToDg(double kg) { this.dg = kg * 10000; }
    public void KgToG(double kg) { this.g = kg * 1000; }
    public void KgToDag(double kg) { this.dag = kg * 100; }
    public void KgToHg(double kg) { this.hg = kg * 10; }
}
