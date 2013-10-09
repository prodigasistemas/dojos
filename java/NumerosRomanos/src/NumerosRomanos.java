import java.util.HashMap;
import java.util.LinkedHashMap;


public class NumerosRomanos {
	
	String numeroRomano = "";
	int resto = 0;
	
	HashMap<Integer, String> mapGrupoNumeros = new LinkedHashMap<Integer, String>();
	
	public NumerosRomanos() {
		mapGrupoNumeros.put(1000, "M");
		mapGrupoNumeros.put(900, "CM");
		mapGrupoNumeros.put(500, "D");
		mapGrupoNumeros.put(400, "CD");
		mapGrupoNumeros.put(100, "C");
		mapGrupoNumeros.put(90, "XC");
		mapGrupoNumeros.put(50, "L");
		mapGrupoNumeros.put(40, "XL");
		mapGrupoNumeros.put(10, "X");
		mapGrupoNumeros.put(9, "IX");
		mapGrupoNumeros.put(5, "V");
		mapGrupoNumeros.put(4, "IV");
		mapGrupoNumeros.put(1, "I");
		
	}
	public String converte(int numero) {
		
		resto = numero % 1000;
		
		if ( numero >= 1000){
			concatena(numero, 1000, 'M');
		}

		if(resto >= 900){
			numeroRomano += "CM";
			resto = resto - 900;
		}
		
		if(resto >= 500){
			numeroRomano += "D";
			resto = resto - 500;
		}
		
		if (resto >= 400){
			numeroRomano += "CD";
			resto = resto - 400;
		}
		
		if ( resto >= 100){
			concatena(resto, 100, 'C');
			resto = resto % 100;
		}

		if(resto >= 90){
			numeroRomano += "XC";
			resto = resto - 90;
		}
		
		if(resto >= 50){
			numeroRomano += "L";
			resto = resto - 50;
		}
		
		if (resto >= 40){
			numeroRomano += "XL";
			resto = resto - 40;
		}

		if(resto >= 10){
			concatena(resto, 10, 'X');
			resto = resto % 10;
		}
		
		if(resto >= 9){
			numeroRomano += "IX";
			resto = resto - 9;
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
	
	private String retornaNumeroRomano(int numero) {
		
		for (Integer chave : iterable) {
			
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