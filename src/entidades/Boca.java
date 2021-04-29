package entidades;

//atributos
public class Boca {
private int dientes;
private boolean lengua;
private comida bola=null;

//Metodos
public void morder(comida comida1)
{
	this.bola=comida1;
	System.out.println("B:Mordiendo la comida");
}
public void masticar()
{
	System.out.println("B:Masticando la comida");
	
}
public void tragar() {
	System.out.println("Tragando la comida");
}


//constructor
public Boca(int dientes, boolean lengua) {
	super();
	this.dientes = dientes;
	this.lengua = lengua;
}

public Boca() {
	this.dientes = 30;
	this.lengua = true;
}


//getter y setter

public int getDientes() {
	return dientes;
}

public void setDientes(int dientes) {
	this.dientes = dientes;
}

public boolean isLengua() {
	return lengua;
}

public void setLengua(boolean lengua) {
	this.lengua = lengua;
}


}
