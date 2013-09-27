package robot;

public class Robo {
	StringBuilder caminho;
	int x;
	int y;
	
	public Robo() {
		caminho = new StringBuilder();
	}
	public String pousa() {
		return "R(0,0)";
	}

	public String move(String comando) {
		montaComando("MOV", new String[] {comando});
		
		caminho.append(anda(comando));
		
		return caminho.toString();
	}
	public String bMove(String[] comandos) {
		
		montaComando("BMOV", comandos);
		
		montaCaminho(comandos);
		
		return caminho.toString();
	}
	
	private void montaCaminho(String[] comandos) {
		for (int i = 0; i < comandos.length - 1; i++) {
			caminho.append(anda(comandos[i])+ "\n");			
		}
		
		caminho.append(anda(comandos[comandos.length-1]));
	}
	private void montaComando(String instrucao, String[] comandos) {
		caminho.append(instrucao);
		caminho.append("(");
		for (int i = 0; i < comandos.length -1; i++) {
			caminho.append(comandos[i]);
			caminho.append(",");
		}
		caminho.append(comandos[comandos.length-1]);
		caminho.append(")");
		caminho.append("\n");
	}
	
	public String anda(String comando){
		char direcao = comando.charAt(0);
		int distancia = Integer.parseInt(comando.substring(1));
		
		if (direcao == 'N'){
		  y += distancia; 	
		}else if (direcao == 'L'){
			x += distancia;
		}else if (direcao == 'O'){
			x -= distancia;
		}else if (direcao == 'S'){
			y -= distancia;
		}
		
		return "R(" + x + "," + y + ")";
	}
}
