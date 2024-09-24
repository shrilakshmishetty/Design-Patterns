
public class FindFile implements Visitor{
	private String fileName;
    private File1 foundFile;

    public FindFile(String fileName) {
        this.fileName = fileName;
    }

    public File1 getFoundFile() {
        return foundFile;
    }

	 @Override
	    public void visit(File1 f) {
	        if (f.getName().equals(fileName)) {
	            foundFile = f;
	        }
	    }

	    @Override
	    public void visit(Directory d) {
	        for (Element element : d.getElements()) {
	            element.accept(this);
	        }
	    }

}
