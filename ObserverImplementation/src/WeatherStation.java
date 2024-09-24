import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
	List<Observer> list=new ArrayList<>();
	String temperature;
	String humidity;
	String pressure;

	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		list.add(o);
	}

	@Override
	public void deregister(Observer o) {
		// TODO Auto-generated method stub
		list.remove(o);
		
	}

	@Override
	public void notifyall() {
		// TODO Auto-generated method stub
		for(Observer o:list) {
			o.update(temperature,humidity,pressure);
		}
		
	}
	
	void setWeather(String temp,String humidity,String pressure) {
		this.temperature=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		notifyall();
		
	}

}
