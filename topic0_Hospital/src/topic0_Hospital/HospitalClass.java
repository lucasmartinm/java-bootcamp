package topic0_Hospital;

public class HospitalClass {

	private String IntensiveCareRooms;
	private String NormalCareRooms;
	private String Bathrooms;
	private String ParticularRooms;
	private String Doctors;
	private String Nurses;

	public void setIntensiveCareRooms(String i) {
		this.IntensiveCareRooms = i;
	}

	public void setNormalCareRooms(String n) {
		this.NormalCareRooms = n;
	}

	public void setBathrooms(String b) {
		this.Bathrooms = b;
	}

	public void setParticularRooms(String pr) {
		this.ParticularRooms = pr;
	}

	public void setDoctors(String dr) {
		this.Doctors = dr;
	}

	public void setNurses(String nu) {
		this.Nurses = nu;
	}

	public String GetHospital() {
		return ("* Intensive Care Rooms:" + IntensiveCareRooms + "\n* Normal Care Rooms:" + NormalCareRooms + "\n* Bathrooms:" + Bathrooms
				+ "\n* Particular Rooms:" + ParticularRooms + "\n* Doctors:" + Doctors + "\n* Nurses:" + Nurses + "\n\n");
	}

}
