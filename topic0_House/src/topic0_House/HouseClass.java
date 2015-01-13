package topic0_House;

public class HouseClass {

	private String ceiling;
	private String wall;
	private String floor;
	private String bedrooms;
	private String bathrooms;

	public void setCeiling(String c) {
		this.ceiling = c;
	}

	public void setWall(String w) {
		this.wall = w;
	}

	public void setFloor(String f) {
		this.floor = f;
	}

	public void setBedrooms(String be) {
		this.bedrooms = be;
	}

	public void setBathrooms(String ba) {
		this.bathrooms = ba;
	}

	public String GetHouse() {
		return ("* Ceiling:" + ceiling + "\n* Wall:" + wall + "\n* Floor:" + floor + "\n* Bedrooms:" + bedrooms + "\n* Bathrooms:"
				+ bathrooms + "\n\n");
	}

}
