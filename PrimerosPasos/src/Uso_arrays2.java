import javax.swing.*;
public class Uso_arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String [] paises = new String[8];
		
		for (int i=0; i<8; i++){
			
			paises[i]= JOptionPane.showInputDialog("Introduce pa�s "+ (i+1));
		}
		
		for(String elemento:paises){
			
			System.out.println(elemento);
		}*/
		
		int [] matriz_aleatorios = new int[150];
		
		for(int i=0; i < matriz_aleatorios.length; i++){
			
			matriz_aleatorios[i]= (int)Math.round(Math.random()*100);
		}
		
		for(int numeros:matriz_aleatorios){
			
			System.out.print(numeros+ " ");
		}

	}

}
