package topic0_House;

import java.util.Scanner;

public class espa�ola_builder implements HouseBuilderClass {

	private HouseClass house;
	public String be, ba;
	public Scanner VAR = new Scanner(System.in);

	public espa�ola_builder() {
		house = new HouseClass();
	}

	@Override
	public void buildCeiling() {
		house.setCeiling("Spanish tiles");
	}

	@Override
	public void buildWall() {
		house.setWall("Cement");
	}

	@Override
	public void buildFloor() {
		house.setFloor("Floor Tiles");
	}

	@Override
	public void buildBedrooms() {
		System.out.println("Ingrese la cantidad de habitaciones que desea tener:\n\n");
		be = VAR.nextLine();
		house.setBedrooms(be);
	}

	public void buildBathrooms() {
		System.out.println("Ingrese la cantidad de ba�os que desea tener:\n\n");
		ba = VAR.nextLine();
		house.setBathrooms(ba);
	}

	@Override
	public HouseClass getHouse() {
		return house;
	}

}
