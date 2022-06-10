public  class Item {
	private String itemID;
	private String description;
	private double priceARS;
	private Categoria categoria;
	
	public Item (String id, String descr, String cat, String precio){
		if (id == null || cat == null){
			throw new IllegalArgumentException();
		}
		this.itemID = id;
		this.description = descr;
		this.categoria = Categoria.valueOf(cat);
		this.priceARS = Double.valueOf(precio);
		
	}
	
	public Item (String id, double priceARS) {
		if (id!=null && priceARS >0){
			this.itemID = id;
			this.priceARS = priceARS;
		} else {
			throw new IllegalArgumentException ();
		}	
	}	
	public String getItemID() {
		return this.itemID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPriceARS() {
		return priceARS;
	}

	public void setPriceARS(double priceARS) {
		if (priceARS<0){
			throw new IllegalArgumentException();
		}
		this.priceARS = priceARS;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public String toString(){
		StringBuffer str = new StringBuffer();
		str.append("ItemID: ");
		str.append(this.itemID);
		str.append(" - ");
		str.append(this.description);
		str.append(" [");
		str.append(this.categoria);
		str.append("] ARS $");
		str.append(String.valueOf(this.priceARS));
		return str.toString();
	}
	
}
