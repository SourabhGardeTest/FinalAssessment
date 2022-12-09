package Questions;

import java.util.Scanner;

public class QuesTwoFibonacci {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter how many numbers you want: ");
		int num = input.nextInt();
		
		int first=0;
		int second=1;
		int third;
		System.out.println("Fibonacci Sequence: ");
		System.out.println(first);
		System.out.println(second);

		for(int i=0;i<num-2;i++) {
			third = second + first;
			System.out.println(third);
			first=second;
			second=third;
		}

		input.close();
	}
}
