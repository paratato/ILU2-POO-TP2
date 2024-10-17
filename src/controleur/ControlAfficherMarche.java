package controleur;

import villagegaulois.Village;

public class ControlAfficherMarche {
	private Village village;

	public ControlAfficherMarche(Village village) {
		this.village = village;
	}
	
	public String[] donnerInfosMarche() {
		String[] infosMarche = new String[village.Marche.getNbEtalsOccupe() * 3]
		infosMarche = village.donnerEtatMarche();
		return infosMarche;
	}
}
