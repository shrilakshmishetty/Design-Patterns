public class CurrentConditionsDisplay implements Observer {

	@Override
	public void update(String temperature, String humidity, String pressure) {
		// TODO Auto-generated method stub
		System.out.println("Current conditions display:"+"\n"+"Temperature -->"+temperature+"\n"+"Humidity --> "+humidity+"\n"+" Pressure --> "+pressure);
		
	}

}
