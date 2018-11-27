package com.ipiecoles.java.java220;
import java.lang.String;
import org.joda.time.LocalDate;

/**
 * Created by pjvilloud on 21/09/17.
 */
public class Employe {
    private String nom;
    private String prenom;
    private String matricule;
    private LocalDate dateEmbauche;
    private Double salaire;

    /**
     * Getter de nom
     * @return nom
     */
    public String getNom(){
        return this.nom;
    }

    /**
     * Setter de nom
     * @param name
     */
    public void setNom(String name){
        this.nom = name;
    }

    /**
     * Getter de prenom
     * @return prenom
     */
    public String getPrenom(){
        return this.prenom;
    }

    /**
     * Setter de prenom
     * @param pnom
     */
    public void setPrenom(String pnom){
        this.prenom = pnom;
    }

    /**
     * Getter de matricule
     * @return matricule
     */
    public String getMatricule(){
        return this.matricule;
    }

    /**
     * Setter de matricule
     * @param mat
     */
    public void setMatricule(String mat){
        this.matricule = mat;
    }

    /**
     * Getter de dateEmbauche
     * @return dateEmbauche
     */
    public LocalDate getDateEmbauche(){
        return this.dateEmbauche;
    }

    /**
     * Setter de dateEmbauche
     * @param dateE
     */
    public void setDateEmbauche(LocalDate dateE){
        this.dateEmbauche = dateE;
    }

    /**
     * Getter de salaire
     * @return salaire
     */
    public Double getSalaire(){
        return this.salaire;
    }

    /**
     * Setter de salaire
     * @param sal
     */
    public void setSalaire(Double sal){
        this.salaire = sal;
    }
}
