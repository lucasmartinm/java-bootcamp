package pila_topic1;

public class Singleton {
	private static Singleton singletonExample = null;
	public static int id;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singletonExample == null) {
			singletonExample = new Singleton();
			id++;
		}
		return singletonExample;
	}

}
