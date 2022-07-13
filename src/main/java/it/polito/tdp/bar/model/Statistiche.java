package it.polito.tdp.bar.model;

public class Statistiche {
	private int clientiTot;
	private int clientiSoddisfatti;
	private int clintiInsoddisfatti;
	
	public Statistiche() {
		super();
		this.clientiTot = 0;
		this.clientiSoddisfatti = 0;
		this.clintiInsoddisfatti = 0;
	}
	
	public  void incrementaClienti(int n) {
		this.clientiTot+=n;
	}
	
	public  void incrementaSoddisfatti(int n) {
		this.clientiSoddisfatti+=n;
	}
	
	public  void incrementaInsoddisfatti(int n) {
		this.clintiInsoddisfatti+=n;
	}

	public int getClientiTot() {
		return clientiTot;
	}

	public int getClientiSoddisfatti() {
		return clientiSoddisfatti;
	}

	public int getClintiInsoddisfatti() {
		return clintiInsoddisfatti;
	}
	
	
	
	
}
