package poo;

public class Auto {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_carroseria;
	
	String color;
	int peso;
	boolean asientos_cuero, climatizador;
	
	public Auto (){
		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_carroseria=500;
	}
	
	public String dime_largo(){ //getter
		
		return "El largo es " + largo;
	}
	
	public String dime_color(){
		
		return "El color del auto es "+color;
	}
	
	public void establece_color(){ //setter
		
		color="blanco";
	}
}
