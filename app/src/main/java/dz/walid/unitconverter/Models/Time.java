package dz.walid.unitconverter.Models;

/**
 * Created by Walid on 26/04/2021.
 */
public class Time {
    //Attributs
    private double seconde;
    private double minute;
    private double heure;


    //Setters
    public void setSeconde(double s) { this.seconde = s;}
    public void setMinute(double m) { this.minute = m;}
    public void setHeure(double h) { this.heure = h;}

    //Getters
    public double getSeconde() { return this.seconde;}
    public double getMinute() { return this.minute;}
    public double getHeure() { return this.heure;}

    //Fonctions de conversions

    //Du seconde vers autres
    public void SToM(double s) { this.minute = s * 0.0166667; }
    public void SToH(double s) { this.heure = s * 0.000277778; }

    //De minute vers autres
    public void MToS(double m) { this.seconde = m * 60; }
    public void MToH(double m) { this.heure = m * 0.0166667; }

    //De heure vers autres
    public void HToS(double h) { this.seconde = h * 3600; }
    public void HToM(double h) { this.minute = h * 60; }
}
