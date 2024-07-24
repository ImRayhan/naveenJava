package naveen.Java;

public class FileConcept_21 {
	
	static String name; //class static var
	int fileSize;//instance var
	
	public static void readFile() {
		System.out.println("read file");
	}
	
	public void writeFile() {
		System.out.println("write file");
	}

	public static void main(String[] args) {

		//call static method:
		//1. directly:
		readFile();
		//2. using class name:
		FileConcept_21.readFile();
		
		FileConcept_21 fc = new FileConcept_21();
		fc.writeFile();
		fc.readFile();//not recommended
		
	}

}
