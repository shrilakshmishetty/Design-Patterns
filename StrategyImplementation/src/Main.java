/*Design a payment system where users can pay by different methods (e.g., Credit Card, PayPal, Bitcoin). Each payment method will be a separate strategy.
1. Strategy Interface: This interface will declare a method for processing payments.
2. Strategies: Each concrete strategy will implement the payment processing in its own way.
3. Context Class: This class will use a strategy to process payments. It allows changing the payment method at runtime.
4. Main: Demonstrate payment processing by different modes.
*/
public class Main {
	public static void main(String[] args) {
		Context context=new Context();
		context.setStrategy(new CreditCard());
		context.performPay(1000);
		context.setStrategy(new PayPal());
		context.performPay(1000);
		context.setStrategy(new Bitcoin());
		context.performPay(1000);
	}
}
