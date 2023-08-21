package Store;

import java.util.TreeSet;

public class ArtistExcersicer {

	public ArtistExcersicer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		TreeSet<String> instruments1 = new TreeSet<>();
        instruments1.add("piano");
        instruments1.add("clarinet");
        instruments1.add("hurdy gurdy");
        instruments1.add("tuba");
		Artist hotPlate = new Artist();
		hotPlate.addMembers("Tom", instruments1);
		TreeSet<String> instrumentSet = new TreeSet<>();
		instrumentSet.add("guitar");
		instrumentSet.add("piano");
		instrumentSet.add("drums");
		hotPlate.addMembers("Christ", instrumentSet);
		
		for(String name: hotPlate.getMembers()) {
			printMemberInstruments(hotPlate, name);
		}

	}
	
	private static void printMemberInstruments(Artist artist, String name) {
		System.out.println("Member:" + name);
		for(String instrument: artist.getInstuments(name)) {
			System.out.println(instrument);
		}
	}

}
