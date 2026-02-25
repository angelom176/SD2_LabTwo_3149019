package griffith;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Name: Angelo Jose Medeiros de Macedo Filho | Student N: 3149019

public class ConversionsTest {
	
	Conversions c = new Conversions();
	
	// Test for euroToDollar method
	// failing test to commit
	
	//UODATE: test PASSED
	@Test
	public void testEuroToDollar() {
		double euro = 100.0;
		assertEquals(110.0, c.euroToDollar(euro), 0.001);
		
		double negativeEuro	 = -50.0;
		assertEquals(-55.0, c.euroToDollar(negativeEuro), 0.001);
		
		double zeroEuro = 0.0;
		assertEquals(0.0, c.euroToDollar(zeroEuro), 0.001);
		
	}
	
	//Failing Dollar to Euro test to commit
	//UPDATE: test PASSED
	@Test
	public void testDollarToEuro() {
		double dollar = 100.0;
		assertEquals(90.909, c.dollarToEuro(dollar), 0.001);
		
		double negativeDollar = -50.0;
		assertEquals(-45.455, c.dollarToEuro(negativeDollar), 0.001);
		
		double zeroDollar = 0.0;
		assertEquals(0.0, c.dollarToEuro(zeroDollar), 0.001);
		
	}
	
	public void testStringToInteger() {
	
	}
	
	public void testIntegerToString() {
	
	}
	
	public void testSwitchCase() {
	
	}
}
