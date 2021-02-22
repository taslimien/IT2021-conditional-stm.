package conditionalstatement;

public class OddOrEven {

	public static void main(String[] args) {

		int number = 100;
		if(number % 50 == 0) {
			System.out.println("Number = " + number + " is even!");
		}else {
			System.out.println("Number = " + number + " is Odd!");
		}

	}

}
