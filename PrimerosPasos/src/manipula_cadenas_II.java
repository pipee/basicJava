
public class manipula_cadenas_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase= "Hoy es un estupendo d�a para aprender a programar en java";
		
		String frase_resumen= frase.substring(0, 29)+ "irnos a la playa y olvidarnos de todo..."
		+" y "+ frase.substring(29, 57);
		
		System.out.println(frase_resumen);

	}

}
