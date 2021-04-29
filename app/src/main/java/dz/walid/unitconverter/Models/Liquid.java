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

    //Attributs pour affichage
    private String mlAf;
    private String clAf;
    private String dlAf;
    private String lAf;
    private String dalAf;
    private String hlAf;

    //Constructeur
    public Liquid() {
    }

    //Setters
    public void setMl(double ml) { this.ml = ml; }
    public void setCl(double cl) { this.cl = cl; }
    public void setDl(double dl) { this.dl = dl; }
    public void setL(double l) { this.l = l; }
    public void setDal(double dal) { this.dal = dal; }
    public void setHl(double hl) { this.hl = hl; }
    public void setMlAf(String mlAf) { this.mlAf = mlAf; }
    public void setClAf(String clAf) { this.clAf = clAf; }
    public void setDlAf(String dlAf) { this.dlAf = dlAf; }
    public void setlAf(String lAf) { this.lAf = lAf; }
    public void setDalAf(String dalAf) { this.dalAf = dalAf; }
    public void setHlAf(String hlAf) { this.hlAf = hlAf; }

    //Getters
    public double getMl() { return ml; }
    public double getCl() { return cl; }
    public double getDl() { return dl; }
    public double getL() { return l; }
    public double getDal() { return dal; }
    public double getHl() { return hl; }
    public String getMlAf() { return mlAf; }
    public String getClAf() { return clAf; }
    public String getDlAf() { return dlAf; }
    public String getlAf() { return lAf; }
    public String getDalAf() { return dalAf; }
    public String getHlAf() { return hlAf; }

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
