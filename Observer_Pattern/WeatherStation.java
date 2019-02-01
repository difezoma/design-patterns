public class WeatherStation{

	public static void main(String[] args){

		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(35.0f, 10.0f, 1.0f);
		weatherData.setMeasurements(32.0f, 7.0f, 1.0f);
		weatherData.setMeasurements(30.0f, 5.0f, 1.0f);

	}

}