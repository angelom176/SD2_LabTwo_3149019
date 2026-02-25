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
	
	//Failing String to Integer test to commit
	//UPDATE: test PASSED
	
	@Test
	public void testStringToInteger() {
		String validString = "123";
		assertEquals(123, c.stringToInteger(validString));
		
		String invalidString = "abc";
		assertEquals(0, c.stringToInteger(invalidString));	
		
		String emptyString = "";
		assertEquals(0, c.stringToInteger(emptyString));
	
	}
	
	//Failing Integer to String test to commit
	@Test
	public void testIntegerToString() {
		int value = 123;
		assertEquals("123", c.integerToString(value));
		
		int negativeValue = -456;
		assertEquals("-456", c.integerToString(negativeValue));
		
		int zeroValue = 0;
		assertEquals("0", c.integerToString(zeroValue));
	
	}
	
	public void testSwitchCase() {
	
	}
}
