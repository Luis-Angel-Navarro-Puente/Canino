package entidades;

public class Estomago {
//atributos de proceso
	private comida bolo=null;

	
	public Estomago() {
		
	}
	
	public void recibir(comida bolo)
	{
		this.bolo=bolo;
		System.out.println("E:Recibio el bolo");
	}
	public void degradar()
	{
		
		System.out.println("E:ESta degradando el bolo");
	}
	public void entregar()
	{
		System.out.println("E:Entrega al instestino");
	}
	

}
