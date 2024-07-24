package naveen.Java;

public class MainMethodOverloading_20 {

	//PSVM(String a[]) for JVM
	public static void main(String[] naveen) {
		System.out.println("main method");
		
		MainMethodOverloading_20.main(10);
		MainMethodOverloading_20.main(10, 20);
	}
	
	public static void main(int[] a) {
		System.out.println("main method INTTTTTTT");
		
		MainMethodOverloading_20.main(10);
		MainMethodOverloading_20.main(10, 20);
	}
	
	public static void main(String args) {
		System.out.println("main method 3");
	}
	
	public static void main(int a) {
		System.out.println("main method 1 " + a);
	}
	
	public static void main(int a, int b) {
		System.out.println("main method 2 " + (a+b));
	}


}
