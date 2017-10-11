import javax.swing.*;
public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "felipe";
		
		String pass = "";
		
		while(clave.equals(pass)==false){
			
			pass = JOptionPane.showInputDialog("Introduce contraseña por favor");
			
			if(clave.equals(pass)==false){
				
				System.out.println("Contraseña incorrecta");
				
			}
		}
		
	System.out.println("contraseña corecta. Vo dale!");
	
	}

}
