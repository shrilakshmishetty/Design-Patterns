
public class CalculateTotalSize implements Visitor{
	private int totalSize = 0;

    public int getTotalSize() {
        return totalSize;
    }

    @Override
    public void visit(File1 f) {
        totalSize += f.getSize();
    }

    @Override
    public void visit(Directory d) {
        for (Element e : d.getElements()) {
            e.accept(this);
        }
    }

}
