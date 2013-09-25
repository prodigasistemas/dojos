package cosanpa;

import junit.framework.Assert;
import junit.framework.TestCase;

public class FizzBuzzTest extends TestCase {
	
	public void testNaoMultiplo3e5(){
		FizzBuzz fb = new FizzBuzz();
		Assert.assertEquals(2, fb.resolve(2));
	}

	public void testMultiplo3(){
		FizzBuzz fb = new FizzBuzz();
		Assert.assertEquals("fizz", fb.resolve(3));
	}
	
	public void testMultiplo5(){
		FizzBuzz fb = new FizzBuzz();
		Assert.assertEquals("buzz", fb.resolve(5));
	}
	
	public void testMultiplo3e5() {
		FizzBuzz fb = new FizzBuzz();
		Assert.assertEquals("fizzbuzz", fb.resolve(15));
	}
	
	public void test0a15(){
		FizzBuzz fb = new FizzBuzz();
		Assert.assertEquals("fizzbuzz 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz", fb.resolveIntervalo(0,15));
	}

}
