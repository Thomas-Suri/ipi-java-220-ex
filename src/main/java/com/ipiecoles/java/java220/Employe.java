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
     * @throws Exception
     */
    public void setDateEmbauche(LocalDate dateE) throws Exception{
        if(dateE != null && dateE.isAfter(LocalDate.now())){
            throw new Exception("La date d'embauche ne peut être postérieure à la date courante");
        }
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

    /**
     * Constructeur par défaut
     */
    public Employe(){

    }

    /**
     * Constructeur avec paramètres
     * @param eNom
     * @param ePremnom
     * @param eMatricule
     * @param eDateEmbauche
     * @param eSalaire
     */
    public Employe(String eNom, String ePremnom, String eMatricule, LocalDate eDateEmbauche, Double eSalaire){
        this.nom = eNom;
        this.prenom = ePremnom;
        this.matricule = eMatricule;
        this.dateEmbauche = eDateEmbauche;
        this.salaire = eSalaire;
    }

    /**
     * Méthode pour calculer le nombre d'année d'ancienneté d'un employé
     * @return la différence entre l'année courante et l'année d'embauche
     */
    public final Integer getNombreAnneeAnciennete(){
        return LocalDate.now().getYear() - dateEmbauche.getYear();
    }



}
