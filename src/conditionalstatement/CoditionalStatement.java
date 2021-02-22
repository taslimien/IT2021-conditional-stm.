package conditionalstatement;

import java.util.Scanner;

public class CoditionalStatement {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.println("Please type weather status");
		boolean isRainTday = sc.nextBoolean();
		if(isRainTday) {
			System.out.println("I will take umberealla with me!");
		}else {
			System.out.println("I will not take umberealla with me!");
		}

	}

}
