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
	
	// Convert integer to string
	public String integerToString(int val) {
		try {
			return Integer.toString(val);
		} catch (Exception e) {
			return ""; // Return empty string for any unexpected error
		}
	}
	
	// I had to add a parameter to make this method work, since it was not clear what the input should be.
	public String switchCase(String val) {
		if (val == null) {
			return "";
			}
		// Switch case for each character in the string
		char[] chars = val.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			if (Character.isUpperCase(c)) {
				chars[i] = Character.toLowerCase(c);
			} else if (Character.isLowerCase(c)) {
				chars[i] = Character.toUpperCase(c);
			}
		}
		return new String(chars);
	}

}
