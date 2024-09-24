import java.util.ArrayList;
import java.util.List;

public class Directory implements Element{
	String name;
	List<Element> list;
	Directory(String name){
		this.name=name;
		this.list=new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	public void addElements(Element e) {
		list.add(e);
	}
	 public List<Element> getElements() {
	        return list;
	    }

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
		
		
	}

}
