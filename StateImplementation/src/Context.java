
public class Context {
	private State s;
	
	public void setState(State s) {
		this.s=s;
		signal();
	}
	
	void signal() {
		s.changeSignal();
	}

}
