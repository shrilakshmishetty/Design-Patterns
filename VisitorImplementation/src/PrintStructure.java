
public class PrintStructure implements Visitor{

	@Override
	public void visit(File1 f) {
		// TODO Auto-generated method stub
		System.out.println("File name is : "+f.getName());
		
	}

	@Override
	public void visit(Directory d) {
		// TODO Auto-generated method stub
		System.out.println("Directory name : "+d.getName());
		for(Element e:d.getElements()) {
			e.accept(this);
			
		}
		
	}

}
