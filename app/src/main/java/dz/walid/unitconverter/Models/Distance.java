package dz.walid.unitconverter.Models;

/**
 * Created by Walid on 26/04/2021.
 */
public class Distance {
    //Attributs
    private double mm;
    private double cm;
    private double dm;
    private double m;
    private double dam;
    private double hm;
    private double km;

    //Attributs pour affichage
    private String mmAf;
    private String cmAf;
    private String dmAf;
    private String mAf;
    private String damAf;
    private String hmAf;
    private String kmAf;

    //Setters
    public void setMm(double mm) { this.mm = mm;}
    public void setCm(double cm) { this.cm = cm;}
    public void setDm(double dm) { this.dm = dm;}
    public void setM(double m) { this.m = m;}
    public void setDam(double dam) { this.dam = dam;}
    public void setHm(double hm) { this.hm = hm;}
    public void setKm(double km) { this.km = km;}
    public void setMmAf(String mmAf) { this.mmAf = mmAf; }
    public void setCmAf(String cmAf) { this.cmAf = cmAf; }
    public void setDmAf(String dmAf) { this.dmAf = dmAf; }
    public void setmAf(String mAf) { this.mAf = mAf; }
    public void setDamAf(String damAf) { this.damAf = damAf; }
    public void setHmAf(String hmAf) { this.hmAf = hmAf; }
    public void setKmAf(String kmAf) { this.kmAf = kmAf; }

    //Getters
    public double getMm() {return this.mm;}
    public double getCm() {return this.cm;}
    public double getDm() {return this.dm;}
    public double getM() {return this.m;}
    public double getDam() {return this.dam;}
    public double getHm() {return this.hm;}
    public double getKm() {return this.km;}
    public String getMmAf() { return mmAf; }
    public String getCmAf() { return cmAf; }
    public String getDmAf() { return dmAf; }
    public String getmAf() { return mAf; }
    public String getDamAf() { return damAf; }
    public String getHmAf() { return hmAf; }
    public String getKmAf() { return kmAf; }

    //Fonctions de conversions

    //Du mm vers autres
    public void MmToCm(double mm) { this.cm = mm * 0.1; }
    public void MmToDm(double mm) { this.dm = mm * 0.01; }
    public void MmToM(double mm) { this.m = mm * 0.001; }
    public void MmToDam(double mm) { this.dam = mm * 0.0001; }
    public void MmToHm(double mm) { this.hm = mm * 0.00001; }
    public void MmToKm(double mm) { this.km = mm * 0.000001; }

    //Du Cm vers autres
    public void CmToMm(double cm) { this.mm = cm * 10; }
    public void CmToDm(double cm) { this.dm = cm * 0.1; }
    public void CmToM(double cm) { this.m = cm * 0.01; }
    public void CmToDam(double cm) { this.dam = cm * 0.001; }
    public void CmToHm(double cm) { this.hm = cm * 0.0001; }
    public void CmToKm(double cm) { this.km = cm * 0.00001; }

    //Du Dm vers autres
    public void DmToMm(double dm) { this.mm = dm * 100; }
    public void DmToCm(double dm) { this.cm = dm * 10; }
    public void DmToM(double dm) { this.m = dm * 0.1; }
    public void DmToDam(double dm) { this.dam = dm * 0.01; }
    public void DmToHm(double dm) { this.hm = dm * 0.001; }
    public void DmToKm(double dm) { this.km = dm * 0.0001; }

    //Du M vers autres
    public void MToMm(double m) { this.mm = m * 1000; }
    public void MToCm(double m) { this.cm = m * 100; }
    public void MToDm(double m) { this.dm = m * 10; }
    public void MToDam(double m) { this.dam = m * 0.1; }
    public void MToHm(double m) { this.hm = m * 0.01; }
    public void MToKm(double m) { this.km = m * 0.001; }

    //Du Dam vers autres
    public void DamToMm(double dam) { this.mm = dam * 10000; }
    public void DamToCm(double dam) { this.cm = dam * 1000; }
    public void DamToDm(double dam) { this.dm = dam * 100; }
    public void DamToM(double dam) { this.m = dam * 10; }
    public void DamToHm(double dam) { this.hm = dam * 0.1; }
    public void DamToKm(double dam) { this.km = dam * 0.01; }

    //Du Dam vers autres
    public void HmToMm(double hm) { this.mm = hm * 100000; }
    public void HmToCm(double hm) { this.cm = hm * 10000; }
    public void HmToDm(double hm) { this.dm = hm * 1000; }
    public void HmToM(double hm) { this.m = hm * 100; }
    public void HmToDam(double hm) { this.dam = hm * 10; }
    public void HmToKm(double hm) { this.km = hm * 0.1; }

    //Du Dam vers autres
    public void KmToMm(double km) { this.mm = km * 1000000; }
    public void KmToCm(double km) { this.cm = km * 100000; }
    public void KmToDm(double km) { this.dm = km * 10000; }
    public void KmToM(double km) { this.m = km * 1000; }
    public void KmToDam(double km) { this.dam = km * 100; }
    public void KmToHm(double km) { this.hm = km * 10; }


}
