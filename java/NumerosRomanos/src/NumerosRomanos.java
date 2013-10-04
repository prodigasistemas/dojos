
public class NumerosRomanos {
	
	String numeroRomano = "";
	
	public String converte(int numero) {
		
		int resto = numero % 100;
		if ( numero >= 100){
			concatena(numero, 100, 'C');
		}

		if(resto >= 50){
			numeroRomano += "L";
			resto = resto - 50;
		}

		if(resto >= 10){
			concatena(resto, 10, 'X');
			resto = resto % 10;
		}
		
		if(resto >= 5){
			numeroRomano += "V";
			resto = resto - 5;
		}
		
		if (resto == 4) {
			numeroRomano +=  "IV";
		}
		else {
			concatena(resto, 1, 'I');
		}
		
		
		return numeroRomano;
	}

	private void concatena(int numero, int divisor, char algarismo) {
		int mod = numero / divisor;
		for(int i = 0; i < mod; i++){
			numeroRomano += algarismo;
		}
	}

}