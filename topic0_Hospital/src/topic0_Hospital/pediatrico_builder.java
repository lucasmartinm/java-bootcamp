package topic0_Hospital;

import java.util.Scanner;

public class pediatrico_builder implements HospitalBuilderClass {

	private HospitalClass hospital;
	public String dr, nu;
	public Scanner VAR = new Scanner(System.in);

	public pediatrico_builder() {
		hospital = new HospitalClass();
	}

	@Override
	public void buildIntensiveCareRooms() {
		hospital.setIntensiveCareRooms("100 Rooms");
	}

	@Override
	public void buildNormalCareRooms() {
		hospital.setNormalCareRooms("140 Rooms");
	}

	@Override
	public void buildBathrooms() {
		hospital.setBathrooms("25");
	}

	@Override
	public void buildParticularRooms() {
		hospital.setParticularRooms("Has 4 playrooms for children");
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
