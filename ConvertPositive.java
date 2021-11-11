package assignments.day1;

public class ConvertPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = -40, result = 0;
		if (number < 0) {
			result = number * (-1);
			System.out.println("The number " + number + " is converted to " + result);
		} else {
			System.out.println("The number " + number + " is positive");
		}
	}

}
