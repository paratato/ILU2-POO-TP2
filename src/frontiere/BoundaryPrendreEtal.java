package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		bool nomVendeurConnu = controlPrendreEtal.verifierIdentite(nomVendeur);
		
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
	}
}
