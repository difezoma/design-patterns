public class StatisticsDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void display(){
		System.out.println("Statistics -- Temperature: "+temperature+", humidity: "+humidity+", pressure: "+pressure);
	}

	public void update(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}