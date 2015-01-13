package topic0_Hospital;

import java.util.Scanner;

public class Topic0_HospitalClass {

	public static String option;
	public static String modify;
	public static Scanner VAR = new Scanner(System.in);
	private static String Hospital_option;

	public static void main(String[] args) {
		do {
			System.out.println("\n");
			System.out.println("Ingrese la tipologia de hospital que desea:\n");
			System.out.println(" 1- Pediatrico\n 2-Oncologico\n 3-Geriatrico\n");
			option = VAR.nextLine();
			while ((option.equals("1") == false) && (option.equals("2") == false) && (option.equals("3") == false)) {
				System.out.println("El valor ingresado es incorrecto,intentelo nuevamente");
				option = VAR.nextLine();
			}
			HospitalBuilderClass hospital = new pediatrico_builder(); // le
																		// asignamos
																		// un
																		// valor
																		// por
																		// defecto
			Hospital_option = "Children Hospital";

			switch (option) {
			case "1":
				hospital = new pediatrico_builder();
				Hospital_option = "Children Hospital";
				break;
			case "2":
				hospital = new oncologico_builder();
				Hospital_option = "Cancer Hospital";
				break;
			case "3":
				hospital = new geriatrico_builder();
				Hospital_option = "Grandparentrs Hospital";
				break;
			default:
				break;
			}

			HospitalDirectorClass HospitalDirector = new HospitalDirectorClass(hospital);
			HospitalDirector.constructHospital();
			HospitalClass hospitalFinal = HospitalDirector.getHospital();
			System.out.println("\t\t\t" + Hospital_option + "\n");
			System.out.println(hospitalFinal.GetHospital());
			System.out.println("If you want to change this configuration press Y if you font press N\n");
			modify = VAR.nextLine();
		} while ((modify.equals("y") == true) || (modify.equals("Y") == true)); // aca
																				// tendria
																				// q
																				// ir
																				// una
																				// or
	}
}
