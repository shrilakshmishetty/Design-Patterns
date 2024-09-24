/*Create a traffic light system that changes its behavior based on its state. The traffic light can be in one of three states: Green, Yellow, or Red. Each state dictates what happens when the light changes.
1. State: Interface that define a method to chage signal.
2. Concrete States: Implement State interface for different Signals (Green, Yellow and Red)
3. Context: Should maintain an instance of a State and delegates state-specific behavior to the current state object. It starts with the initial state (Green).
4. Main: Demonstrate the traffic signal states by changing the signals.
*/
public class Main {
	public static void main(String[] args) {
		Context context=new Context();
		context.setState(new GreenSignal());
		context.setState(new YellowSignal());
		context.setState(new RedSignal());
		
		
	}

}
