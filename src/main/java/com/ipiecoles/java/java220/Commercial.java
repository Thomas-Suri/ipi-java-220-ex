package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.Objects;

public class Commercial extends Employe{
    private Double caAnnuel = 0d;
    private Integer performance;

    /**
     * Getter caAnnuel
     * @return caAnnuel
     */
    public Double getCaAnnuel(){
        return this.caAnnuel;
    }

    /**
     * Setter caAnnuel
     * @param sCaAnnuel
     */
    public void setCaAnnuel(Double sCaAnnuel){
        this.caAnnuel = sCaAnnuel;
    }

    /**
     * Getter de performance
     * @return performance
     */
    public Integer getPerformance(){
        return this.performance;
    }

    /**
     * Setter de performance
     * @param perf
     */
    public void setPerformance(Integer perf){
        this.performance = perf;
    }

    /**
     * Constructeur par défaut
     */
    public Commercial(){

    }

    public Commercial(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Double caAnnuel){
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.caAnnuel = caAnnuel;
    }

    public Commercial(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Double caAnnuel, Integer performance){
        this(nom, prenom, matricule, dateEmbauche, salaire, caAnnuel);
        this.performance = performance;
    }

    public Note equivalenceNote(){
        switch (performance){
            case 0:
            case 50:
                return Note.INSUFFISANT;
            case 100:
                return Note.PASSABLE;
            case 150:
                return Note.BIEN;
            case 200:
                return Note.TRES_BIEN;
            default:
                return null;
        }
    }

    @Override
    public Double getPrimeAnnuelle() {
        return Math.max(Math.ceil(this.getCaAnnuel()*0.05),500);
    }

    public Boolean performanceEgale(Integer performace){
        return this.performance.equals(performace);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof  Commercial)) return false;
        if (!super.equals(o)) return false;

        Commercial that = (Commercial) o;

        return Double.compare(that.caAnnuel, caAnnuel) == 0;
    }

    @Override
    public String toString(){
        return "Commercial{"+"caAnnuel= "+caAnnuel+", performance= "+performance+"} "+super.toString();
    }
}
