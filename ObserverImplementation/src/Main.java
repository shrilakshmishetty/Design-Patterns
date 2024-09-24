/*Create a notification system for a weather station. The weather station collects data and notifies various display units whenever there is a change in the weather conditions. The display units could be a CurrentConditionsDisplay, a StatisticsDisplay, and a ForecastDisplay.
1. Observer: Interface with update method to collect temperature, humidity and pressure.
2. Subject: Interface with method to register, deregister with Observer and to notify. 
3. WeatherStation: Implements the Subject interface to perform register, deregister and notify.
4. Display units: Implements various dispaly units (CurrentConditionsDisplay, StatisticsDisplay, ForecastDisplay) that implement the Observer interface.
5. Main class: Demonstrate the notification mechanism by creating a weather station and adding/removing display units.
*/
public class Main {
	public static void main(String[] args) {
		WeatherStation w=new WeatherStation();
		Observer o1=new CurrentConditionsDisplay();
		Observer o2=new ForecastDisplay();
		Observer o3=new StatisticsDisplay();
		w.register(o1);
		w.register(o2);
		w.register(o3);
		w.setWeather("30 C", "200", "400 pa");
		System.out.println("-----------------------------");
		w.deregister(o2);
		w.setWeather("25 C", "20", "500 pa");
		
		
	}

}
