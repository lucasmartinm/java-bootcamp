package topic0_House;

import java.util.Scanner;

public class cabaña_Builder implements HouseBuilderClass {

	private HouseClass house;
	public String be, ba;
	public Scanner VAR = new Scanner(System.in);

	public cabaña_Builder() {
		house = new HouseClass();
	}

	@Override
	public void buildCeiling() {
		house.setCeiling("Corrugated iron roof");
	}

	@Override
	public void buildWall() {
		house.setWall("wood");
	}

	@Override
	public void buildFloor() {
		house.setFloor("wood");
	}

	@Override
	public void buildBedrooms() {
		System.out.println("Ingrese la cantidad de habitaciones que desea tener:\n\n");
		be = VAR.nextLine();
		house.setBedrooms(be);
	}

	public void buildBathrooms() {
		System.out.println("Ingrese la cantidad de baños que desea tener:\n\n");
		ba = VAR.nextLine();
		house.setBathrooms(ba);
	}

	@Override
	public HouseClass getHouse() {
		return house;
	}

}
