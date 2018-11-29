package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;
import com.ipiecoles.java.java220.Exceptions.TechnicienException;

public class Technicien extends Employe implements Comparable<Technicien> {
    private Integer grade;

    /**
     * Getter de grade
     * @return grade
     */
    public Integer getGrade(){
        return this.grade;
    }

    /**
     * Setter de grade
     * @param grade
     */
    public void setGrade(Integer grade) throws TechnicienException{
        if (grade <= 0 || grade > 5){
            throw new TechnicienException(TechnicienException.GRADE, this, grade);
        }
        this.grade = grade;
    }


    /**
     * Constructeur par défaut
     */
    public Technicien(){

    }

    /**
     * Constructeur avec paramètre
     * @param nom
     * @param prenom
     * @param matricule
     * @param dateEmbauche
     * @param salaire
     * @param grade
     */
    public Technicien(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Integer grade) throws TechnicienException {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.setGrade(grade);
    }

    @Override
    public void setSalaire(Double salaire){
        super.setSalaire(salaire*(1+(double)grade/10));
    }

    @Override
    public Double getPrimeAnnuelle() {
        Double primeAnnuelleBase = Entreprise.primeAnnuelleBase();
        return primeAnnuelleBase + primeAnnuelleBase * ((double)grade /10)+Entreprise.PRIME_ANCIENNETE * this.getNombreAnneeAnciennete();
    }

    public Integer getNbConges(){
        return super.getNbConges() + this.getNombreAnneeAnciennete();
    }


    @Override
    public String toString(){
        return "Technicien{"+"grade="+grade+"} "+ super.toString();
    }



    @Override
    public int compareTo(Technicien o) {
        return Integer.compare(o.getGrade(), this.grade);
    }
}
