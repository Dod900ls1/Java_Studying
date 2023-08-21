package Lab2;
import java.util.Date;


public class ClassicalCD extends Item {

	public ClassicalCD() {
		// TODO Auto-generated constructor stub
	}
	
	public ClassicalCD(String title, double price, int quantity,
			String composer, String[] performers, String location, Date releaseDate) {
		super(title, price, quantity);
		this.setComposer(composer);
		this.setRecordingLocation(location);
		this.setReleaseDate(releaseDate);
	}
	private String composer;
	private String[] performers = new String[5];
	private String recordingLocation;
	private Date releaseDate;
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getRecordingLocation() {
		return recordingLocation;
	}
	public void setRecordingLocation(String recordingLocation) {
		this.recordingLocation = recordingLocation;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	private int performerCount = 0;
	public void addPerformer(String performer) {
		if(performers.length - performerCount == 0) {
			System.out.println("The array is full,");
		}else{
			performers[performerCount] = performer;
			performerCount++;
		}
	}
	
	public void showPerformers() {
		if(performerCount == 0) {
			System.out.println("Array is empty");
		}else {
			for(String i: performers) {
				System.out.println(i);
			}
		}
	}


}
