package com.ipiecoles.java.java220;

import java.util.HashSet;

public class Manager extends Employe {
    private HashSet<Technicien> equipe = new HashSet();

    /**
     * Getter de equipe
     * @return
     */
    public HashSet<Technicien> getEquipe(){
        return this.equipe;
    }

    /**
     * Setter de equipe
     * @param sEquipe
     */
    public void setEquipe(HashSet<Technicien> sEquipe){
        this.equipe = sEquipe;
    }

    public void ajoutTechnicienEquipe(Technicien technicien){
        equipe.add(technicien);
    }

    @Override
    public void setSalaire(Double salaire){
        super.setSalaire(salaire * Entreprise.INDICE_MANAGER + (salaire * (double)equipe.size() / 10));
    }

    @Override
    public Double getPrimeAnnuelle() {
        return Entreprise.primeAnnuelleBase() + equipe.size() * Entreprise.PRIME_MANAGER_PAR_TECHNICIEN;
    }

    public void augmenterSalaire(Double pourcentage){
        super.augmenterSalaire(pourcentage);
        augmenterSalaireEquipe(pourcentage);
    }

    private void augmenterSalaireEquipe(Double pourcentage){
        for (Technicien technicien : equipe){
            technicien.augmenterSalaire(pourcentage);
        }
    }
}
