package pila_topic1;

public class PilaClass {
	class Nodo {
		int price;
		String name;
		Nodo sig;
	}

	private Nodo raiz;

	public PilaClass() {
		raiz = null;
	}

	public void insertar(int x, String nombre) {
		Nodo nuevo;
		nuevo = new Nodo();
		nuevo.price = x;
		nuevo.name = nombre;
		if (raiz == null) {
			nuevo.sig = null;
			raiz = nuevo;
		} else {
			nuevo.sig = raiz;
			raiz = nuevo;
		}
	}

	public void imprimir() {
		Nodo reco = raiz;
		System.out.println("i" + "Items added to the cart:\n");
		while (reco != null) {
			System.out.print(reco.name + "\t\t\t$" + reco.price + "\n");
			reco = reco.sig;
		}
		System.out.println();
	}

	public void imprimir_descuentos(int op) {
		Nodo reco = raiz;
		int total = 0, min = 1000, max = 0;
		switch (op) {
		case 1:
			reco = raiz;
			total = 0;
			while (reco != null) {
				total = total + reco.price;
				reco = reco.sig;
			}
			total = total - (total / 10);
			System.out.println("Total = $" + total);
			break;

		case 2:
			reco = raiz;
			total = 0;
			while (reco != null) {
				total = total + reco.price;
				if (reco.price < min)
					min = reco.price;
				reco = reco.sig;
			}
			total = total - min;
			System.out.println("Total = $" + total);
			break;

		case 3:
			reco = raiz;
			total = 0;
			while (reco != null) {
				total = total + reco.price;
				if (reco.price > max)
					max = reco.price;
				reco = reco.sig;
			}
			total = total - (max * (90 / 100));
			System.out.println("Total = $" + total);
			break;
		default:
			System.out.println("hay algun problema");
		}
	}

}
