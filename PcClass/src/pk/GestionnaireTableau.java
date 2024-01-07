package pk;

import java.util.*;

class GestionnaireTableau {
    private Pc[] tableau;

    public GestionnaireTableau(Pc[] tableau) {
        this.tableau = tableau;
    }

    public void trierTableau() {
        Arrays.sort(tableau);
    }

    public void ajouterElement(Pc element) {
        Pc[] nouveauTableau = Arrays.copyOf(tableau, tableau.length + 1);
        nouveauTableau[tableau.length] = element;
        tableau = nouveauTableau;
    }

    public void supprimerElement(int index) {
        if (index >= 0 && index < tableau.length) {
            Pc[] nouveauTableau = new Pc[tableau.length - 1];
            System.arraycopy(tableau, 0, nouveauTableau, 0, index);
            System.arraycopy(tableau, index + 1, nouveauTableau, index, tableau.length - index - 1);
            tableau = nouveauTableau;
        }
    }

    public int compterElements() {
        return tableau.length;
    }

    public void inverserOrdre() {
        Pc[] inverse = new Pc[tableau.length];
        for (int i = 0; i < tableau.length; i++) {
            inverse[i] = tableau[tableau.length - i - 1];
        }
        tableau = inverse;
    }

    public void afficherElements() {
        for (Pc pc : tableau) {
            System.out.println(pc);
        }
    }

  
    
    public class Main {
        public static void main(String[] args) {
            Pc[] tableau = { new Pc("Dell", 2020), new PcPortatif("HP", 2019, "ModèleXYZ") };
            GestionnaireTableau gestionnaireTableau = new GestionnaireTableau(tableau);

            gestionnaireTableau.trierTableau();

            List<Pc> liste = new ArrayList<>();
            GestionnaireListe gestionnaireListe = new GestionnaireListe(liste);

            gestionnaireListe.alimenterListe();
            gestionnaireListe.afficherListe();
        }
    }


}
