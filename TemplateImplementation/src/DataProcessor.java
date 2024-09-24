
public abstract class DataProcessor {
	
	void processData() {
		read();
		parse();
		process();
		save();
	}
	void read() {
		System.out.println("Read the data");
	}
	void save() {
		System.out.println("Save the data");
	}
	abstract void parse();
	abstract void process();

}
