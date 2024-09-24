/*Develop a file system where you have different types of files and directories. You want to perform various operations such as printing the file structure, calculating the total size, and finding a specific file. 
1. Element Interface: Define accept method where the Element in the file system that can accept a visitor 
2. Concrete Elements: Implements the interface for File and Directory
3. Visitor Interface: Defind visit methods for File and Directory
4. Concrete Visitors: Implement Visotor interface to PrintStructure, CalculateTotalSize and FindFile
5. Main: Demonstrate Print Structure, Total Size and Find File
*/
public class Main {
	public static void main(String[] args) {
		File1 f1=new File1("shrii1",30);
		File1 f2=new File1("shrii2",40);
		File1 f3=new File1("shrii3",50);
		Directory d1=new Directory("Folder1");
		d1.addElements(f1);
		d1.addElements(f2);
	//Print the structure
		
		PrintStructure p=new PrintStructure();
		d1.accept(p);
		
		
		//Calculate size
		 CalculateTotalSize size = new CalculateTotalSize();
	        f3.accept(size);
	        System.out.println("Total Size: " + size.getTotalSize());

	        // Find a file
	        FindFile findVisitor = new FindFile("shrii1");
	        d1.accept(findVisitor);
	        File1 foundFile = findVisitor.getFoundFile();
	        if (foundFile != null) {
	            System.out.println("Found file: " + foundFile.getName() + " with size " + foundFile.getSize());
	        } else {
	            System.out.println("File not found");
	}
	}

}
