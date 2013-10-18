import java.util.HashMap;
import java.util.LinkedHashMap;


public class NumerosRomanos {
	
	String numeroRomano = "";
	int resto = 0;
	
	HashMap<Integer, CallBack> mapGrupoNumeros = new LinkedHashMap<Integer, CallBack>();
	
	public NumerosRomanos() {
		mapGrupoNumeros.put(1000, new Concatena("M"));
		mapGrupoNumeros.put(900, new Append("CM"));
		mapGrupoNumeros.put(500, new Append("D"));
		mapGrupoNumeros.put(400, new Append("CD"));
		mapGrupoNumeros.put(100, new Concatena("C"));
		mapGrupoNumeros.put(90, new Append("XC"));
		mapGrupoNumeros.put(50, new Append("L"));
		mapGrupoNumeros.put(40, new Append("XL"));
		mapGrupoNumeros.put(10, new Concatena("X"));
		mapGrupoNumeros.put(9, new Append("IX"));
		mapGrupoNumeros.put(5, new Append("V"));
		mapGrupoNumeros.put(4, new Append("IV"));
		mapGrupoNumeros.put(1, new Concatena("I"));
		
	}
	
	public String converte(int numero) {
		
		resto = numero ;

		for (Integer chave : mapGrupoNumeros.keySet()) {
			if(resto >= chave)
				mapGrupoNumeros.get(chave).executa(resto, chave);
		}
		
		return numeroRomano;
	}

	
	abstract class CallBack{
		
		protected String algarismo;

		public CallBack(String algarismo) {
			this.algarismo = algarismo;
		}
		
		abstract void executa(int numero, int divisor);
		
	}
	
	class Concatena extends CallBack{

		public Concatena(String algarismo) {
			super(algarismo);
		}

		public void executa(int numero, int divisor) {

			int mod = numero / divisor;
			for(int i = 0; i < mod; i++){
				numeroRomano += algarismo;
			}
			resto = resto % divisor;
		}
		
	}
	
	class Append extends CallBack{

		public Append(String algarismo) {
			super(algarismo);
		}

		public void executa(int numero, int divisor) {

			numeroRomano += algarismo;
			resto = resto - divisor;
			
		}
		
	}

}