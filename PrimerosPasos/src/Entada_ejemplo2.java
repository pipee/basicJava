import javax.swing.*;
public class Entada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre por favor");
		
		String edad= JOptionPane.showInputDialog("Introduce la edad");
		
		int edad_usuario = Integer.parseInt(edad);
		
		System.out.println("Hola "+nombre_usuario+" el a�o que viene tendras "+(edad_usuario+1)+" a�os");

	}

}
