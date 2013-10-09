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
	
	public void teste37() {
		NumerosRomanos numeros = new NumerosRomanos();
		assertEquals("XXXVII", numeros.converte(37));
	}
	
	public void teste96() {
		NumerosRomanos numeros = new NumerosRomanos();
		assertEquals("XCVI", numeros.converte(96));
	}
	
	public void teste149() {
		NumerosRomanos numeros = new NumerosRomanos();
		assertEquals("CXLIX", numeros.converte(149));
	}

	public void teste499() {
		NumerosRomanos numeros = new NumerosRomanos();
		assertEquals("CDXCIX", numeros.converte(499));
	}	

	public void teste1173() {
		NumerosRomanos numeros = new NumerosRomanos();
		assertEquals("MCLXXIII", numeros.converte(1173));
	}	

	public void teste2344() {
		NumerosRomanos numeros = new NumerosRomanos();
		assertEquals("MMCCCXLIV", numeros.converte(2344));
	}	

}
