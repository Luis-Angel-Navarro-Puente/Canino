package principal;

import entidades.Perro;
import entidades.Persona;
import entidades.comida;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
Perro firulay; //declarando
firulay=new Perro(); //instanciando/constructor

firulay.ladrar();
firulay.movercola();



Perro rambo=new Perro("Rambo","Rotweiler",5);
rambo.ladrar();
	

rambo.setNombre("Princesa");
rambo.setraza("Chusco");
rambo.setedad(2);

System.out.println(rambo.getNombre());
System.out.println(rambo.getraza());
System.out.println(rambo.getedad());
*/
//-------------------------------------------------------------

Persona carlitos=new Persona();
Perro firulays=new Perro();
comida croquetas=new comida(10,20,30,40,50);

carlitos.jugar(firulays);

System.out.println(firulays);


//alimentarlo
carlitos.alimentar(firulays, croquetas);

	}

}
