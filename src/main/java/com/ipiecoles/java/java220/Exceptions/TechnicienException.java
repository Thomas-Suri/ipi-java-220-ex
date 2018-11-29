package com.ipiecoles.java.java220.Exceptions;

import com.ipiecoles.java.java220.Technicien;


public class TechnicienException extends Exception{
    public static final String GRADE = "Le grade doit être compris entre 1 et 5 : ";

    public TechnicienException(String message, Technicien technicien, Object valeurIncorrecte){
        super(message + valeurIncorrecte + ", technicien : "+technicien.toString());
        System.out.println(this.getMessage());
    }
}
