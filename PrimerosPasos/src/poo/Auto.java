package poo;

public class Auto {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	public Auto (){
		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
	}
	
	public String dime_datos_generales(){ //getter
		
		return "La plataforma del auto tiene " + ruedas+" ruedas"+ " Mide "+ largo/1000+ " metros "+
		"Con un ancho de "+ancho+" cm "+" Con un motor de "+motor+" CC "+
		" y un peso de carrosería de "+peso_plataforma+" kg";
	}
	
	public String dime_color(){
		
		return "El color del auto es "+color;
	}
	
	public void establece_color(String color_auto){ //setter
		
		color=color_auto;
	}
	
	public void configura_asientos(String asientos_cuero){//setter
		
		if (asientos_cuero.equalsIgnoreCase("si")){
			
			this.asientos_cuero=true;
		}else{
			this.asientos_cuero=false;
		}
	}
	public String dime_asientos(){//getter
		
		if(asientos_cuero==true){
			return "El auto tiene asientos de cuero ";
		}else{
			return "El auto tiene asientos de serie ";
		}
	}
	public void configura_climatizador(String climatizador){
		
		if(climatizador.equalsIgnoreCase("si")){
			this.climatizador=true;
		}else{
			this.climatizador=false;
		}
	}
	public String dime_climatizador(){
		if(climatizador==true){
			return "El auto tiene climatizador";
		}else{
			return "El auto tiene A/C";
		}
	}
	public String dime_peso_coche(){//getter/setter
		int peso_carroceria=500;
		
		peso_total=peso_plataforma+peso_carroceria;
		
		if(asientos_cuero==true){
			peso_total=peso_total+50;
		}
		if(climatizador==true){
			peso_total=peso_total+20;
		}
		return "El peso del auto es "+peso_total+" Kilos";
	}
	public int precio_auto(){//getter
		int precio_final=10000;
		
		if(asientos_cuero==true){
			precio_final+=2000;
		}
		if(climatizador==true){
			precio_final+=1500;
		}
		return precio_final;
	}
}
