package assignments.day1;

public class Fibonacci {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int firstNum = 0, secNum = 1, range = 8, sum = 0;
		System.out.println(firstNum);
		System.out.println(secNum);

		for (int i = 1; i < range; i++) {

			sum = firstNum + secNum;

			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);

		}

	}
}
