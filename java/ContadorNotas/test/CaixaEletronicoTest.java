import junit.framework.TestCase;
import org.junit.Test;

public class CaixaEletronicoTest extends TestCase{
	
	@Test
	public static void testSaque30(){
		CaixaEletronico caixa = new CaixaEletronico();
		String saque = caixa.saque(30);
		assertEquals(saque, "20,10,");
	}
	
	@Test
	public static void testSaque80(){
		CaixaEletronico caixa = new CaixaEletronico();
		String saque = caixa.saque(80);
		assertEquals(saque, "50,20,10,");
	}
	
	@Test
	public static void testSaque100() {
		CaixaEletronico caixa = new CaixaEletronico();
		String saque = caixa.saque(100);
		assertEquals(saque, "100");
	}
}
