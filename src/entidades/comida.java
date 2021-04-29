package entidades;

public class comida {
	
private int vitamina;
private int proteina;
private int caloria;
private int grasas;
private int carbohidratos;

public comida(int vitamina, int proteina, int caloria, int grasas, int carbohidratos) {
	
	this.vitamina = vitamina;
	this.proteina = proteina;
	this.caloria = caloria;
	this.grasas = grasas;
	this.carbohidratos = carbohidratos;
}

public comida() {
	this.vitamina = 0;
	this.proteina = 0;
	this.caloria = 0;
	this.grasas = 0;
	this.carbohidratos = 0;
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



}
