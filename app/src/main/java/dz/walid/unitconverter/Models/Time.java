package dz.walid.unitconverter.Models;

/**
 * Created by Walid on 26/04/2021.
 */
public class Time {

    //Attributs
    private double seconde;
    private double minute;
    private double heure;

    //Attributs pour affichage
    private String secondeAf;
    private String minuteAf;
    private String heureAf;

    //Constructeur
    public Time() {
    }


    //Setters
    public void setSeconde(double seconde) { this.seconde = seconde; }
    public void setMinute(double minute) { this.minute = minute; }
    public void setHeure(double heure) { this.heure = heure; }
    public void setSecondeAf(String secondeAf) { this.secondeAf = secondeAf; }
    public void setMinuteAf(String minuteAf) { this.minuteAf = minuteAf; }
    public void setHeureAf(String heureAf) { this.heureAf = heureAf; }


    //Getters
    public double getSeconde() { return seconde; }
    public double getMinute() { return minute; }
    public double getHeure() { return heure; }
    public String getSecondeAf() { return secondeAf; }
    public String getMinuteAf() { return minuteAf; }
    public String getHeureAf() { return heureAf; }

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
