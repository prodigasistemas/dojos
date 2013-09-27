package robot;

import junit.framework.TestCase;

public class RobotTest extends TestCase {
	
	public void testePouso() {
		Robo wally = new Robo();
		assertEquals("R(0,0)", wally.pousa());
	}
	
	public void testeMoverNorte2(){
		Robo w = new Robo();
		assertEquals("MOV(N2)\nR(0,2)", w.move("N2"));
	}
	
	public void testeBMover() {
		Robo w = new Robo();
		String [] comandos = {"N2","L1","N2","S2","O1"};
		assertEquals("BMOV(N2,L1,N2,S2,O1)\nR(0,2)\nR(1,2)\nR(1,4)\nR(1,2)\nR(0,2)", w.bMove(comandos));
	}

}
