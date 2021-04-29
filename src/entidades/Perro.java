package entidades;

public class Perro {

//atributos	
private String nombre;
private String raza;
private int edad;
private int x;
private int y;
private cardinales direccion;
private Genero genero;
//alimentar
private Boca boca;
private Estomago estomago;
private Intestino intestino;
private Sangre sangre;
//atributo de proceso
private comida comida1=null;


//constructores
public Perro()
{
	nombre="";
	raza="";
	edad=0;
	this.x=0;
	this.y=0;
	this.direccion=cardinales.ESTE;
	this.genero= Genero.MACHO;
	this.boca=new Boca();
	this.estomago=new Estomago();
	this.sangre=new Sangre();
	this.intestino=new Intestino(sangre);
	
}

public Perro(String nombre,String raza,int edad)
{
	this.nombre=nombre;
	this.raza=raza;
	this.edad=edad;
	this.x=0;
	this.y=0;
	this.direccion=cardinales.ESTE;
	this.genero= Genero.MACHO;
	this.boca=new Boca();
	this.estomago=new Estomago();
	this.sangre=new Sangre();
	this.intestino=new Intestino(sangre);
	
}

//metodos
public void ladrar() {
	System.out.println("Guau guau");
}
public void movercola()
{
	System.out.println("Moviendo la cola");
}

public void avanzar(int pasos)
{
	switch(this.direccion)
	{
	case ESTE: this.x +=pasos;break;
	case OESTE: this.x -=pasos;break;
	case NORTE: this.y +=pasos;break;
	case SUR: this.y -=pasos;break;
	}
}

public void retroceder(int pasos)
{
	avanzar(pasos*-1);
}

public void girarizquierda()
{
	switch(this.direccion)
	{
	case ESTE: this.direccion=cardinales.NORTE; break;
	case NORTE: this.direccion=cardinales.OESTE; break;
	case OESTE: this.direccion=cardinales.SUR; break;
	case SUR: this.direccion=cardinales.ESTE; break;
	}
}

public void comer1(comida comida1)
{
	this.comida1=comida1;
	boca.morder(comida1);
	boca.masticar();
	boca.tragar();
	
	estomago.recibir(comida1);
	estomago.degradar();
	estomago.entregar();
	
	intestino.recibir(comida1);
	intestino.absorver();
	
	System.out.println(this.sangre);
	
}

//sobreescribir el metodo que permite imprimir informacion del objeto

@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.nombre+": "+this.direccion+" "+"("+this.x+" "+this.y+")";
}



//getter y setter

public String getNombre()
{
	return this.nombre;
}



public void setNombre(String nombre1)
{
	this.nombre=nombre1;
}

public String getraza()
{
	return this.raza;
}

public void setraza(String raza)
{
	this.raza=raza;
}

public int getedad()
{
	return this.edad;
}

public void setedad(int edad)
{
	this.edad=edad;
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public cardinales getDireccion() {
	return direccion;
}

public void setDireccion(cardinales direccion) {
	this.direccion = direccion;
}

public Genero getGenero() {
	return genero;
}

public void setGenero(Genero genero) {
	this.genero = genero;
}





}

