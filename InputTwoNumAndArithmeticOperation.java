package java_practice;

import java.util.Scanner;

public class InputTwoNumAndArithmeticOperation {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b= sc.nextInt();
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);

	}

}
