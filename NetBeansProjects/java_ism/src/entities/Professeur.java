/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Mr Demba Ndiaye
 */
public class Professeur extends User {

    private int nci;
    private String grade;
    private final String ROLE="ROLE_ETUDIANT";
    
    public Professeur() {
        // super();
        this.role=ROLE;
    }

    public Professeur(int nci, String grade, String nomComplet) {
        super(nomComplet);
        this.nci = nci;
        this.grade = grade;
        this.role = ROLE;
    }

    public Professeur(int nci, String grade, int id, String nomComplet) {
        super(id, nomComplet);
        this.nci = nci;
        this.grade = grade;
        this.role = ROLE;
    }

    
    
}
