package assignments.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 13;
		boolean flag = false;
		for (int i = 2; i < a / 2; i++) {
			int remainder = a%i;
			if (remainder == 0) {
				flag = true;
				break;
			}

		}
		if (!flag) {
			System.out.println(a + " is a Prime Number.");
		} else {
			System.out.println(a + " is not a Prime Number.");
		}

	}

}
