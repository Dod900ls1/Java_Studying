package Lab2;

public class Artist {

	public Artist() {
		// TODO Auto-generated constructor stub
	}
	
	public Artist(String name) {
		this.setName(name);
	}
	
	private String[] memberNames = new String[20];
	private String[] memberIstruments = new String[20];
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
