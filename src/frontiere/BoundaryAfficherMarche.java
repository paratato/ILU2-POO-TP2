package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] infosMarche = new String[controleAfficherMarche.getNbEtalsOccupe() * 3]
		infosMarche = controleAfficherMarche.donnerInfosMarche();
		if(infosMarche.length == 0) {
			System.out.println("Le march� est vide, revenez plus tard.");
		} else {
			System.out.println(nomAcheteur + " , vous trouverez au march� : ");
			for (int i = 1; i < infosMarche.length; i++) {
				System.out.println("- " + infosMarche[i] + " qui vend " + infosMarche[++i] + " " + infosMarche[++i]);
			}
		}
	}
}
