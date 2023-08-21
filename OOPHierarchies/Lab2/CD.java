package Lab2;
import Lab2.Artist;
import java.util.Date;

public class CD extends Item {

	public CD() {
		// TODO Auto-generated constructor stub
	}
	
	public CD(String title, double price, int quantity, 
			Artist artist, Date releaseDate) {
		super(title, price, quantity);
		this.setArtist(artist);
		this.setReleaseDate(releaseDate);
		
	}
	private Artist artist;
	private Date releaseDate;
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
}
