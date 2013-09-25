package cosanpa;

public class FizzBuzz {

	public Object resolve(int valor) {
		if (verificaFizzBuzz(valor)){
			return "fizzbuzz";
		}
		if(verificaFizz(valor)){
			return "fizz";
		}
		
		if (verificaBuzz(valor)){
			return "buzz";
		}
		
		return valor;
	}

	private boolean verificaFizzBuzz(int valor) {
		return verificaBuzz(valor) && verificaFizz(valor) ;
	}

	private boolean verificaBuzz(int valor) { 
		return valor%5==0;
	}

	private boolean verificaFizz(int valor) {
		return valor%3==0;
	}

	public String resolveIntervalo(int i, int j) {
		String retorno = "";
		
		for( ; i <= j; i++) {
			retorno += this.resolve(i) + " ";
		}
		return retorno.trim();
		
	}
}
