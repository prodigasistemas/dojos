import junit.framework.TestCase;


public class NumerosRomanosTest extends TestCase {

	public void testa1() {
		NumerosRomanos numeros = new NumerosRomanos();
		assertEquals("I", numeros.converte(1));
	}
	
	public void testa4() {
		NumerosRomanos numeros = new NumerosRomanos();
		assertEquals("IV", numeros.converte(4));
	}
	
	public void testa30() {
		NumerosRomanos numeros = new NumerosRomanos();
		assertEquals("XXX", numeros.converte(30));
	}
	
	public void testa158(){
		NumerosRomanos numeros = new NumerosRomanos();
		assertEquals("CLVIII", numeros.converte(158));
	}
}
