package test;

public class CompteEpargne {
	
	private String numero;
	private int solde;
	
	public CompteEpargne(String numero, int solde) {
		//super();
		this.numero = numero;
		this.solde = solde;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}
	
	public void crediter(int mont) {
		solde = solde + mont;
	}
	
	public void debiter(int mont) {
		if (mont <= solde) {
			solde = solde - mont;
		}
		else {
			System.out.println("Operation impossible");
		}
	}

}
