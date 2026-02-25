package griffith;

//Name: Angelo Jose Medeiros de Macedo Filho | Student N: 3149019

public class Conversions {
	
	//methods stub to be implemented

	public double euroToDollar(double euro) {
		return euro * 1.1; // Assuming 1 Euro = 1.1 Dollars
		
	}
	
	public double dollarToEuro(double dollar) {
		return dollar / 1.1; // Assuming 1 Dollar = 0.909 Euros
	}
	
	// Convert string to integer, return 0 for invalid input
	public int stringToInteger(String val) {
		try {
			return Integer.parseInt(val);
		} catch (NumberFormatException e) {
			return 0; // Return 0 for invalid input
		}
	}
	
	public String integerToString(int val) {
		return null;
	}
	
	public String switchCase() {
		return null;
	}

}
