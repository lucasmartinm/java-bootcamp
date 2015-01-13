package topic0_Hospital;

import java.util.Scanner;

public class oncologico_builder implements HospitalBuilderClass {

	private HospitalClass hospital;
	public String dr, nu;
	public Scanner VAR = new Scanner(System.in);

	public oncologico_builder() {
		hospital = new HospitalClass();
	}

	@Override
	public void buildIntensiveCareRooms() {
		hospital.setIntensiveCareRooms("30 Rooms");
	}

	@Override
	public void buildNormalCareRooms() {
		hospital.setNormalCareRooms("80 Rooms");
	}

	@Override
	public void buildBathrooms() {
		hospital.setBathrooms("12");
	}

	@Override
	public void buildParticularRooms() {
		hospital.setParticularRooms("Pharmacy");
	}

	@Override
	public void buildDoctors() {
		System.out.println("Enter the number of doctors who owns the hospital\n\n");
		dr = VAR.nextLine();
		hospital.setDoctors(dr);
	}

	public void buildNurses() {
		System.out.println("Enter the number of nurses who owns the hospital\n\n");
		nu = VAR.nextLine();
		hospital.setNurses(nu);
	}

	@Override
	public HospitalClass getHospital() {
		return hospital;
	}

}
