package pk;
import java.util.Objects;

class Pc implements Comparable<Pc> {
    private String marque;
    private int anneeFabrication;

    public Pc(String marque, int anneeFabrication) {
        this.marque = marque;
        this.anneeFabrication = anneeFabrication;
    }

    // Getters and setters

    @Override
    public String toString() {
        return "Pc [marque=" + marque + ", anneeFabrication=" + anneeFabrication + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Pc other = (Pc) obj;
        return Objects.equals(marque, other.marque) && anneeFabrication == other.anneeFabrication;
    }

    @Override
    public Pc clone() {
        return new Pc(this.marque, this.anneeFabrication);
    }

    @Override
    public int compareTo(Pc other) {
        return Integer.compare(this.anneeFabrication, other.anneeFabrication);
    }
}
