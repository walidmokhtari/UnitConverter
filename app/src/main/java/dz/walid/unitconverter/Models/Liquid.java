package dz.walid.unitconverter.Models;

/**
 * Created by Walid on 26/04/2021.
 */
public class Liquid {
    //Attributs
    private double ml;
    private double cl;
    private double dl;
    private double l;
    private double dal;
    private double hl;

    //Setters
    public void setMl(float ml) { this.ml = ml;}
    public void setCl(float cl) { this.cl = cl;}
    public void setDl(float dl) { this.dl = dl;}
    public void setL(float l) { this.l = l;}
    public void setDag(float dal) { this.dal = dal;}
    public void setHg(float hl) { this.hl = hl;}

    //Getters
    public double getMl() {return this.ml;}
    public double getCl() {return this.cl;}
    public double getDl() {return this.dl;}
    public double getL() {return this.l;}
    public double getDal() {return this.dal;}
    public double getHl() {return this.hl;}

    //Fonctions de conversions

    //Du ml vers autres
    public void MlToCl(double ml) { this.cl = ml * 0.1; }
    public void MlToDl(double ml) { this.dl = ml * 0.01; }
    public void MlToL(double ml) { this.l = ml * 0.001; }
    public void MlToDal(double ml) { this.dal = ml * 0.0001; }
    public void MlToHl(double ml) { this.hl = ml * 0.00001; }

    //Du cl vers autres
    public void ClToMl(double cl) { this.ml = cl * 10; }
    public void ClToDl(double cl) { this.dl = cl * 0.1; }
    public void ClToL(double cl) { this.l = cl * 0.01; }
    public void ClToDal(double cl) { this.dal = cl * 0.001; }
    public void ClToHl(double cl) { this.hl = cl * 0.0001; }

    //Du dl vers autres
    public void DlToMl(double dl) { this.ml = dl * 100; }
    public void DlToCl(double dl) { this.cl = dl * 10; }
    public void DlToL(double dl) { this.l = dl * 0.1; }
    public void DlToDal(double dl) { this.dal = dl * 0.01; }
    public void DlToHl(double dl) { this.hl = dl * 0.001; }

    //Du L vers autres
    public void LToMl(double l) { this.ml = l * 1000; }
    public void LToCl(double l) { this.cl = l * 100; }
    public void LToDl(double l) { this.dl = l * 10; }
    public void LToDal(double l) { this.dal = l * 0.1; }
    public void LToHl(double l) { this.hl = l * 0.01; }

    //Du dal vers autres
    public void DalToMl(double dal) { this.ml = dal * 10000; }
    public void DalToCl(double dal) { this.cl = dal * 1000; }
    public void DalToDl(double dal) { this.dl = dal * 100; }
    public void DalToL(double dal) { this.l = dal * 10; }
    public void DalToHl(double dal) { this.hl = dal * 0.1; }

    //Du hl vers autres
    public void HlToMl(double hl) { this.ml = hl * 100000; }
    public void HlToCl(double hl) { this.cl = hl * 10000; }
    public void HlToDl(double hl) { this.dl = hl * 1000; }
    public void HlToL(double hl) { this.l = hl * 100; }
    public void HlToDal(double hl) { this.dal = hl * 10; }

}
