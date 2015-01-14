package pila_topic1;

import java.util.Scanner;

public class payment2 {
	int option, credit_number;
	String email, name, password;
	public static Scanner VAR = new Scanner(System.in);

	public payment2() {
		System.out.println("Please enter the desired payment option:\n");
		System.out.println(" 1) Credit Card\n 2) PayPal\n 3) Cash\n");
		do {
			option = VAR.nextInt();
			switch (option) {
			case 1:
				System.out.println("Name:\n");
				name = VAR.next();
				System.out.println("Credit Number:\n");
				credit_number = VAR.nextInt();
				break;
			case 2:
				System.out.println("Email:\n");
				name = VAR.next();
				System.out.println("Password:\n");
				password = VAR.next();
				break;
			case 3:
				System.out.println("We do not need any infomation, thanks for your purchase\n");
				break;
			default:
				System.out.println("incorrect character,please, try it again\n");
				break;
			}
		} while (option != 1 || option != 2 || option != 3);
	}

}
