package pk;

class PcPortatif extends Pc {
    private String modele;

    public PcPortatif(String marque, int anneeFabrication, String modele) {
        super(marque, anneeFabrication);
        this.modele = modele;
    }


    public String getModele() {
		return modele;
	}


	public void setModele(String modele) {
		this.modele = modele;
	}


	@Override
    public String toString() {
        return "PcPortatif [modele=" + modele + ", " + super.toString() + "]";
    }
}
