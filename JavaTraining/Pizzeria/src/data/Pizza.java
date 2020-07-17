package data;

public enum Pizza {
	MARGHERITA(true, true, false, false),
	CAPRICIOSA(true, true, true, false), 
	PROSCIUTTO(true, true, false, true);
	
	private boolean sos;
	private boolean ser;
	private boolean pieczarki;
	private boolean szynka;
		
	public boolean isSos() {
		return sos;
	}

	public void setSos(boolean sos) {
		this.sos = sos;
	}
	
	public boolean isSer() {
		return ser;
	}

	public void setSer(boolean ser) {
		this.ser = ser;
	}

	public boolean isPieczarki() {
		return pieczarki;
	}

	public void setPieczarki(boolean pieczarki) {
		this.pieczarki = pieczarki;
	}

	public boolean isSzynka() {
		return szynka;
	}

	public void setSzynka(boolean szynka) {
		this.szynka = szynka;
	}
	
	Pizza(boolean sos, boolean ser, boolean pieczarki, boolean szynka) {
		this.setSos(sos);
		this.setSer(ser);
		this.setPieczarki(pieczarki);
		this.setSzynka(szynka);
	}
	
	@Override
	public String toString() {
		String result = this.name() + " Sk³adniki:";
		if(sos) {
			result = result + " sos pomidorowy";
		}
		if(ser) {
			result = result + " ser";
		}
		if(pieczarki) {
			result = result + " pieczarki";
		}
		if(szynka) {
			result = result + " szynka";
		}
		return result;
	}

	
}
