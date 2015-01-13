package topic0_House;

public class HouseDirectorClass {

	private HouseBuilderClass ConstructorDeCasa = null;

	public HouseDirectorClass(HouseBuilderClass HouseBuilder) {
		this.ConstructorDeCasa = HouseBuilder;
	}

	public void constructHouse() {
		ConstructorDeCasa.buildCeiling();
		ConstructorDeCasa.buildWall();
		ConstructorDeCasa.buildFloor();
		ConstructorDeCasa.buildBedrooms();
		ConstructorDeCasa.buildBathrooms();
	}

	public HouseClass getHouse() {
		return ConstructorDeCasa.getHouse();
	}

}
