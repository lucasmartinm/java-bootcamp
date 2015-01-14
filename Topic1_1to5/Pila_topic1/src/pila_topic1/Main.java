package pila_topic1;

import java.util.Scanner;

public class Main {
	static int option, op;
	static String data;
	public static Scanner VAR = new Scanner(System.in);
	public static String cart_items;

	public static void main(String[] args) {

		PilaConstruct Lista = new PilaConstruct(); // armo la lista de elementos
		Payment mode = new Payment();

		System.out.println("Press the number of the item to add to the cart, if you wish to checkout press 0:\n\n");
		System.out.println("0)CHECKOUT\n 1)Art 1\t\t $10 \n 2)Art 2\t\t $20 \n 3)Art 3\t\t $30 \n 4)Art 4\t\t $40 \n 5)Art 5\t\t $50 ");
		System.out.println(" 6)Art 6\t\t $60\n\t *Offer price\t\t $55\n 7)Art 7\t\t $70\n\t *Offer price\t\t $65\n ");
		Lista.seteo();
		System.out
				.println("Thank you for using our online shopping system, to view the items in your shopping cart press Y, otherwise press any other letter\n\n");
		cart_items = VAR.next();
		if ((cart_items.equals("y") == true) || (cart_items.equals("Y") == true))
			Lista.pila1.imprimir();

		System.out.println("Please enter the desired payment option:\n");
		System.out.println(" 1) Credit Card\n 2) PayPal\n 3) Cash\n");
		do {
			option = VAR.nextInt();
			switch (option) {
			case 1:
				System.out.println("Name:\n");
				mode.setName(VAR.next());
				System.out.println("Credit Number:\n");
				mode.setCredit_number(VAR.nextInt());
				break;
			case 2:
				System.out.println("Email:\n");
				mode.setEmail(VAR.next());
				System.out.println("Password:\n");
				mode.setPassword(VAR.next());
				break;
			case 3:
				System.out.println("We do not need any infomation, thanks for your purchase\n");
				break;
			default:
				System.out.println("incorrect character,please, try it again\n");
				break;
			}
		} while (option != 1 || option != 2 || option != 3);
		op = mode.option;
		Lista.pila1.imprimir_descuentos(op); // imprimo el total con los
												// descuentos
		Singleton transaction = Singleton.getInstance(); // creo el id de
															// transaccion unico
		System.out.println("The number of transaction is:\n" + transaction.id);
	}

}
