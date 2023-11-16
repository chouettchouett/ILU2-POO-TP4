package produit;

public enum Unite {
	Litre("l"), Centilitre("c"), Millilitre("m"), Kilogramme("kg"), Gramme("g"), Piece("c")	;

	private String unite;

	private Unite(String unite) {
		this.unite = unite;
	}

	public String getUnite() {
		return unite;
	}
	// faire un to string

}
