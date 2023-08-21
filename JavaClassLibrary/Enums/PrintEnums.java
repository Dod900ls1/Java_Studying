package Enums;

public class PrintEnums {

	public static void main(String[] args) {
		for(TirePressures i: TirePressures.values()) {
			TirePressures tp = TirePressures.valueOf("RR");
			tp.overridePressure(22);
			System.out.printf("%s -> %d\n",i.getName(), i.getPressure());
		}
	}

}
