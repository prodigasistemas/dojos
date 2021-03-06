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
	public static void testSaque35(){
		CaixaEletronico caixa = new CaixaEletronico();
		String saque = caixa.saque(35);
		assertEquals(saque, "Notas n�o dispon�veis para esse valor");
	}

	@Test
	public static void testSaque100() {
		CaixaEletronico caixa = new CaixaEletronico();
		String saque = caixa.saque(100);
		assertEquals(saque, "100");
	}
	
	@Test
	public static void testSaque150() {
		CaixaEletronico caixa = new CaixaEletronico();
		String saque = caixa.saque(150);
		assertEquals(saque,"100,50");
	}

	@Test
	public static void testSaque230() {
		CaixaEletronico caixa = new CaixaEletronico();
		String saque = caixa.saque(230);
		assertEquals(saque, "100, 100, 20, 10");
	}
}
