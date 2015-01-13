package topic0_Hospital;

public class HospitalDirectorClass {

	private HospitalBuilderClass ConstructorDelHospital = null;

	public HospitalDirectorClass(HospitalBuilderClass HospitalBuilder) {
		this.ConstructorDelHospital = HospitalBuilder;
	}

	public void constructHospital() {
		ConstructorDelHospital.buildIntensiveCareRooms();
		ConstructorDelHospital.buildNormalCareRooms();
		ConstructorDelHospital.buildBathrooms();
		ConstructorDelHospital.buildParticularRooms();
		ConstructorDelHospital.buildDoctors();
		ConstructorDelHospital.buildNurses();
	}

	public HospitalClass getHospital() {
		return ConstructorDelHospital.getHospital();
	}

}
