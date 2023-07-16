package java_practice;

import java.util.Scanner;

public class Inputfromuser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();//only one string
		Scanner sc1 = new Scanner(System.in);
		String fullnameString = sc1.nextLine();
		System.out.println(name);
		System.out.println(fullnameString);
	}

}
