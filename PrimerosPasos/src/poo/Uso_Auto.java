package poo;

import javax.swing.*;

public class Uso_Auto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto Suzuki = new Auto();
		
		Suzuki.establece_color(JOptionPane.showInputDialog("Ingresa color"));
		
		System.out.println(Suzuki.dime_datos_generales());
		System.out.println(Suzuki.dime_color());
		
		Suzuki.configura_asientos(JOptionPane.showInputDialog("Asientos de cuero?"));
		System.out.println(Suzuki.dime_asientos());
		
		Suzuki.configura_climatizador(JOptionPane.showInputDialog("Climatizador?"));
		System.out.println(Suzuki.dime_climatizador());
		
		System.out.println(Suzuki.dime_peso_coche());
		
		System.out.println("El precio final del auto es "+Suzuki.precio_auto()+" Euros");
	}

}
