package fr.ul.miage;
import fr.ul.miage.Affectation;

public class Main {
    public static void main(String[] args) {
        // Exemple #4
        // On créé les noeuds
        Prog prog = new Prog();
        Fonction principal = new Fonction("main");
        Affectation aff = new Affectation();
        Idf i = new Idf("i");
        Lire lire = new Lire();
        Ecrire ecrire = new Ecrire();
        Plus plus = new Plus();
        Idf i2 = new Idf("i");
        Idf j = new Idf("j");
        // On lie les noeuds
        prog.ajouterUnFils(principal);
        principal.ajouterUnFils(aff);
        principal.ajouterUnFils(ecrire);
        aff.setFilsGauche(i);
        aff.setFilsDroit(lire);
        ecrire.setLeFils(plus);
        plus.setFilsGauche(i2);
        plus.setFilsDroit(j);
        TxtAfficheur.afficher(prog);

    }
}