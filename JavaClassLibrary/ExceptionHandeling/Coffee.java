package ExceptionHandeling;

public class Coffee {

	private int temperature;
	public void setTemperature(int temperature) throws TooHotException {
		int s = temperature;
		if(s < 120) {
			this.temperature = temperature;
		}else {
			throw new TooHotException("Coffee is hotter than 120C. IT`S TOO HOT!");
		}		
	}
	
	public int getTemperature() {
		return temperature;
	}
	public Coffee(int temperature) throws TooHotException {
		setTemperature(temperature);
	}

}
