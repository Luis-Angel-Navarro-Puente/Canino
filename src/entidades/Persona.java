package entidades;

public class Persona {
private String nombre;
private int edad;

public Persona()
{
this.nombre="";
this.edad=0;
}

public Persona(String nombre)
{
	this.nombre=nombre;
	this.edad=0;
}

public Persona(String nombre, int edad)
{
	this.nombre=nombre;
	this.edad=edad;
	
}

public String getnombre()
{
	return this.nombre;
}
public void setnombre(String nombre)
{
	this.nombre=nombre;
}

public int getedad()
{
	return this.edad;
}

public void setedad(int edad)
{
	this.edad=edad;
}

public void jugar(Perro perro)
{
 perro.setNombre("firulay");
 perro.ladrar();
 perro.movercola();
 perro.avanzar(5);
 perro.girarizquierda();
 
}
public void alimentar(Perro perro,comida comida2)
{
	perro.comer1(comida2);
}



}
