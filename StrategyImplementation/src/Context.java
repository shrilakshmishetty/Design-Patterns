
public class Context {
	Strategy strategy;
	
	
	void setStrategy(Strategy strategy) {
		this.strategy=strategy;
		
	}
	
	void performPay(int amount) {
		strategy.pay(amount);
		
	}

}
