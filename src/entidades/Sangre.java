package entidades;

public class Sangre {
	private int globulosrojos;
	private int globulosblancos;
	private int vitamina;
	private int proteina;
	private int caloria;
	private int grasas;
	private int carbohidratos;
	
	//metodos:
	
	
	
	//Constructor
	
	public Sangre(int globulosrojos, int globulosblancos, int vitamina, int proteina, int caloria, int grasas,
			int carbohidratos) {
		super();
		this.globulosrojos = globulosrojos;
		this.globulosblancos = globulosblancos;
		this.vitamina = vitamina;
		this.proteina = proteina;
		this.caloria = caloria;
		this.grasas = grasas;
		this.carbohidratos = carbohidratos;
	}
	public Sangre() {
		super();
		this.globulosrojos = 0;
		this.globulosblancos = 0;
		this.vitamina = 0;
		this.proteina = 0;
		this.caloria = 0;
		this.grasas = 0;
		this.carbohidratos = 0;
	}
	//getter y setters
	public int getGlobulosrojos() {
		return globulosrojos;
	}
	public void setGlobulosrojos(int globulosrojos) {
		this.globulosrojos = globulosrojos;
	}
	public int getGlobulosblancos() {
		return globulosblancos;
	}
	public void setGlobulosblancos(int globulosblancos) {
		this.globulosblancos = globulosblancos;
	}
	public int getVitamina() {
		return vitamina;
	}
	public void setVitamina(int vitamina) {
		this.vitamina = vitamina;
	}
	public int getProteina() {
		return proteina;
	}
	public void setProteina(int proteina) {
		this.proteina = proteina;
	}
	public int getCaloria() {
		return caloria;
	}
	public void setCaloria(int caloria) {
		this.caloria = caloria;
	}
	public int getGrasas() {
		return grasas;
	}
	public void setGrasas(int grasas) {
		this.grasas = grasas;
	}
	public int getCarbohidratos() {
		return carbohidratos;
	}
	public void setCarbohidratos(int carbohidratos) {
		this.carbohidratos = carbohidratos;
	}
	
	//Add

	public void addVitamina(int vitamina) {
		this.vitamina += vitamina;
	}

	public void addProteina(int proteina) {
		this.proteina += proteina;
	}

	public void addCaloria(int caloria) {
		this.caloria += caloria;
	}

	public void addGrasas(int grasas) {
		this.grasas += grasas;
	}
	
	public void addCarbohidratos(int carbohidratos) {
		this.carbohidratos += carbohidratos;
	}
	
	
	@Override
	public String toString() {
		return "Sangre: "+
	","+this.caloria+
	","+this.carbohidratos+
	","+this.grasas+
	","+this.proteina+
	","+this.vitamina
	
	;
	}
	
	
	
	

}
