package pila_topic1;

import java.util.Scanner;

public class PilaConstruct {
	public static Scanner VAR = new Scanner(System.in);
	public PilaClass pila1 = new PilaClass();
	public int var;

	public PilaConstruct() {
	}

	public void seteo() {

		do {
			var = VAR.nextInt();
			switch (var) {
			case 1:
				pila1.insertar(10, "Art 1");
				System.out.println("Art 1 added to the cart\n");
				break;
			case 2:
				pila1.insertar(20, "Art 2");
				System.out.println("Art 2 added to the cart\n");
				break;
			case 3:
				pila1.insertar(30, "Art 3");
				System.out.println("Art 3 added to the cart\n");
				break;
			case 4:
				pila1.insertar(40, "Art 4");
				System.out.println("Art 4 added to the cart\n");
				break;
			case 5:
				pila1.insertar(50, "Art 5");
				System.out.println("Art 5 added to the cart\n");
				break;
			case 6:
				pila1.insertar(55, "Art 6");
				System.out.println("Art 6 added to the cart\n");
				break;
			case 7:
				pila1.insertar(65, "Art 7");
				System.out.println("Art 7 added to the cart\n");
				break;
			case 0:
				break;
			default:
				System.out.println("incorrect character, try it again\n");
				break;
			}
		} while (var != 0);

	}

}
