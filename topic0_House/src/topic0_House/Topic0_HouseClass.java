package topic0_House;

import java.util.Scanner;

public class Topic0_HouseClass {

	public static String option;
	public static Scanner VAR = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Ingrese la tiplogia de casa que desea:\n\n");
		System.out.println(" 1- Victoriana\n 2-Espa�ola\n 3-Caba�a\n\n");
		option = VAR.nextLine();
		while ((option.equals("1") == false) && (option.equals("2") == false) && (option.equals("3") == false)) {
			System.out.println("El valor ingresado es incorrecto,intentelo nuevamente");
			option = VAR.nextLine();
		}
		HouseBuilderClass casa = new victoriana_builder(); // le asignamos un
															// valor por defecto
		switch (option) {
		case "1":
			casa = new victoriana_builder();
			break;
		case "2":
			casa = new espa�ola_builder();
			break;
		case "3":
			casa = new caba�a_Builder();
			break;
		default:
			break;
		}

		HouseDirectorClass HouseDirector = new HouseDirectorClass(casa);
		HouseDirector.constructHouse();
		HouseClass casaFinal = HouseDirector.getHouse();
		System.out.println(casaFinal.GetHouse());

	}
}
