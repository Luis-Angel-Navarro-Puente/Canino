package entidades;

public class Intestino {
	// atributo
	private Sangre sangre;
	// atributo de proceso
	private comida bolo = null;

	public Intestino(Sangre sangre) {
		this.sangre = sangre;
	}

	public Sangre getSangre() {
		return sangre;
	}

	public void setSangre(Sangre sangre) {
		this.sangre = sangre;
	}

//metodos:-----------------------------
	public void recibir(comida bolo) {
		this.bolo = bolo;

	}

	public void absorver() {
		int vitamina = bolo.getVitamina();
		int proteina = bolo.getProteina();
		int caloria = bolo.getCaloria();
		int grasas = bolo.getGrasas();
		int carbohidratos = bolo.getCarbohidratos();

		bolo.setVitamina(0);
		bolo.setProteina(0);
		bolo.setCaloria(0);
		bolo.setGrasas(0);
		bolo.setCarbohidratos(0);
		
		sangre.addVitamina(vitamina);
		sangre.addProteina(proteina);
		sangre.addCaloria(caloria);
		sangre.addGrasas(grasas);
		sangre.addCarbohidratos(carbohidratos);
		
		System.out.println("Ha absorvido");
	}

}
