
public class File1 implements Element{
	String name;
	int size;


	File1(String name,int size){
		this.name=name;
		this.size=size;
		
	}
	
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
		
	}

}
