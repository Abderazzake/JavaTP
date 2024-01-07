package pk;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

class GestionnaireListe {
    private List<Pc> liste;

    public GestionnaireListe(List<Pc> liste) {
        this.liste = liste;
    }

    public void alimenterListe() {
        liste.add(new Pc("Lenovo", 2021));
        liste.add(new PcPortatif("Acer", 2022, "Modele123"));
    }

    public void afficherListe() {
        for (Pc pc : liste) {
            System.out.println(pc);
        }
    }

    public void parcourirListe() {
        Iterator<Pc> iterator = liste.iterator();
        while (iterator.hasNext()) {
            Pc pc = iterator.next();
            System.out.println(pc);
        }
    }

    public void insererElement(Pc element, int index) {
        if (index >= 0 && index <= liste.size()) {
            liste.add(index, element);
        }
    }

    public Pc recupererElement(int index) {
        if (index >= 0 && index < liste.size()) {
            return liste.get(index);
        }
        return null;
    }

    public void supprimerElement(int index) {
        if (index >= 0 && index < liste.size()) {
            liste.remove(index);
        }
    }

    public int rechercherElement(Pc element) {
        return liste.indexOf(element);
    }

    public void trierListe() {
        Collections.sort(liste);
    }

    public List<Pc> copierListe() {
        return new ArrayList<>(liste);
    }

    public void melangerListe() {
        Collections.shuffle(liste);
    }

    public void inverserListe() {
        Collections.reverse(liste);
    }

    public List<Pc> extrairePartieListe(int fromIndex, int toIndex) {
        if (fromIndex >= 0 && toIndex <= liste.size() && fromIndex <= toIndex) {
            return liste.subList(fromIndex, toIndex);
        }
        return null;
    }

    public boolean comparerListes(List<Pc> autreListe) {
        return liste.equals(autreListe);
    }

    public void echangerElementsListe(int index1, int index2) {
        if (index1 >= 0 && index1 < liste.size() && index2 >= 0 && index2 < liste.size()) {
            Collections.swap(liste, index1, index2);
        }
    }

    public void viderListe() {
        liste.clear();
    }

    public boolean estVide() {
        return liste.isEmpty();
    }
}
