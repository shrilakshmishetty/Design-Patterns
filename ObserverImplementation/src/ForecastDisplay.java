
public class ForecastDisplay implements Observer {

	@Override
	public void update(String temperature, String humidity, String pressure) {
		// TODO Auto-generated method stub
		System.out.println("Forecast display:"+"\n"+"Temperature -->"+temperature+"\n"+"Humidity --> "+humidity+"\n"+" Pressure --> "+pressure);
		
	}

}
