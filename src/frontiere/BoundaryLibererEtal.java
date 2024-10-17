package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		boolean vendeurReconnu = (controlLibererEtal.isVendeur(nomVendeur)!=null);
		if(!vendeurReconnu) {
			Systeme.out.println("Mais vous n'�tes pas inscrit sur notre march� aujourd'hui !");
		} else {
			String[] donneesEtal[] = controleLibererEtal(nomVendeur);
		}
	}

}
