package griffith;

public class ConversionsTest {
	public static void main(String[] args) {
		System.out.println("Testing Conversions class:");
		System.out.println("10 inches to centimeters: " + Conversions.inchesToCentimeters(10));
		System.out.println("25.4 centimeters to inches: " + Conversions.centimetersToInches(25.4));
		System.out.println("5 miles to kilometers: " + Conversions.milesToKilometers(5));
		System.out.println("8 kilometers to miles: " + Conversions.kilometersToMiles(8));
	}
}
