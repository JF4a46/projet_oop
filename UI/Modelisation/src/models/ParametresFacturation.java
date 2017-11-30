package models;

public class ParametresFacturation {
	private int classeEconomique, classeMoyenne, classeLuxe, classeUtilitaire, assurance, coutkm, minimumKilo,
			forfaitIllimiteKM, retardPoucent, taxeProvinciale, taxeFederale, litreEssence;

	public ParametresFacturation(int classeEconomique, int classeMoyenne, int classeLuxe, int classeUtilitaire,
			int assurance, int coutkm, int minimumKilo, int forfaitIllimiteKM, int retardPoucent, int taxeProvinciale,
			int taxeFederale, int litreEssence) {
		this.classeEconomique = classeEconomique;
		this.classeMoyenne = classeMoyenne;
		this.classeLuxe = classeLuxe;
		this.classeUtilitaire = classeUtilitaire;
		this.assurance = assurance;
		this.coutkm = coutkm;
		this.minimumKilo = minimumKilo;
		this.forfaitIllimiteKM = forfaitIllimiteKM;
		this.retardPoucent = retardPoucent;
		this.taxeProvinciale = taxeProvinciale;
		this.taxeFederale = taxeFederale;
		this.litreEssence = litreEssence;
	}

	public String toString() {
		return "ParamètresFacturation [classeEconomique=" + classeEconomique + ", classeMoyenne=" + classeMoyenne
				+ ", classeLuxe=" + classeLuxe + ", classeUtilitaire=" + classeUtilitaire + ", assurance=" + assurance
				+ ", coutkm=" + coutkm + ", minimumKilo=" + minimumKilo + ", forfaitIllimiteKM=" + forfaitIllimiteKM
				+ ", retardPoucent=" + retardPoucent + ", taxeProvinciale=" + taxeProvinciale + ", taxeFederale="
				+ taxeFederale + ", litreEssence=" + litreEssence + "]";
	}

	public int getClasseEconomique() {
		return classeEconomique;
	}

	public void setClasseEconomique(int classeEconomique) {
		this.classeEconomique = classeEconomique;
	}

	public int getClasseMoyenne() {
		return classeMoyenne;
	}

	public void setClasseMoyenne(int classeMoyenne) {
		this.classeMoyenne = classeMoyenne;
	}

	public int getClasseLuxe() {
		return classeLuxe;
	}

	public void setClasseLuxe(int classeLuxe) {
		this.classeLuxe = classeLuxe;
	}

	public int getClasseUtilitaire() {
		return classeUtilitaire;
	}

	public void setClasseUtilitaire(int classeUtilitaire) {
		this.classeUtilitaire = classeUtilitaire;
	}

	public int getAssurance() {
		return assurance;
	}

	public void setAssurance(int assurance) {
		this.assurance = assurance;
	}

	public int getCoutkm() {
		return coutkm;
	}

	public void setCoutkm(int coutkm) {
		this.coutkm = coutkm;
	}

	public int getMinimumKilo() {
		return minimumKilo;
	}

	public void setMinimumKilo(int minimumKilo) {
		this.minimumKilo = minimumKilo;
	}

	public int getForfaitIllimiteKM() {
		return forfaitIllimiteKM;
	}

	public void setForfaitIllimiteKM(int forfaitIllimiteKM) {
		this.forfaitIllimiteKM = forfaitIllimiteKM;
	}

	public int getRetardPoucent() {
		return retardPoucent;
	}

	public void setRetardPoucent(int retardPoucent) {
		this.retardPoucent = retardPoucent;
	}

	public int getTaxeProvinciale() {
		return taxeProvinciale;
	}

	public void setTaxeProvinciale(int taxeProvinciale) {
		this.taxeProvinciale = taxeProvinciale;
	}

	public int getTaxeFederale() {
		return taxeFederale;
	}

	public void setTaxeFederale(int taxeFederale) {
		this.taxeFederale = taxeFederale;
	}

	public int getLitreEssence() {
		return litreEssence;
	}

	public void setLitreEssence(int litreEssence) {
		this.litreEssence = litreEssence;
	}

}