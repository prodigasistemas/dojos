
public class CaixaEletronico {

	private int[] notas;
	private StringBuilder listaNotas;
	
	public CaixaEletronico(){
		notas = new int[]{100,50,20,10};
	}
	
	public String saque(int valor) {
		listaNotas = new StringBuilder();
		for (int nota : getNotas()) {
			int qtdNotas = valor / nota;
			valor = valor%nota;
			
			adicionaNotas(nota, qtdNotas);
		}
		
		return listaNotas.toString();
	}

	private void adicionaNotas(int nota, int qtdNotas) {
		for (int i = 0; i < qtdNotas; i++) {
			listaNotas.append(nota+",");				
		}
	}
	
	public int[] getNotas(){
		return notas;
	}

}
