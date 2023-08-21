package Store;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Artist {

	public Artist() {
		memberNames = new TreeSet<String>();
		memberInstruments = new TreeMap<String, SortedSet<String>>();
	}
	
	public Artist(String name) {
		this();
		this.setName(name);
	}
	
	private SortedSet<String> memberNames;
	private Map<String, SortedSet<String>> memberInstruments;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addMembers(String name, SortedSet<String> instruments) {
		memberNames.add(name);
		memberInstruments.put(name, instruments);
	}
	
	public SortedSet<String> getMembers(){
		return memberNames;
	}
	
	public SortedSet<String> getInstuments(String name){
		return memberInstruments.get(name);
	}
	
}
