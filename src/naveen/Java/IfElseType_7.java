package naveen.Java;

public class IfElseType_7 {
	public static void main(String[] args) {

//		String test = "NaveeN";
//		if(test.equals("Naveen")) {
//			System.out.println("PASS");
//		}
//		else {
//			System.out.println("FAIL");
//		}

//		String browser = "chrome";
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		
//		if(browser.equals("firefox")) {
//			System.out.println("launch firefox");
//		}
//		
//		if(browser.equals("edge")) {
//			System.out.println("launch edge");
//		}
//		
//		if(browser.equals("safari")) {
//			System.out.println("launch safari");
//		}
//		
//		else {
//			System.out.println("plz pass the right browser...." + browser);
//		}

		String browser = "naveen";

		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		else if(browser.equals("edge")) {
			System.out.println("launch edge");
		}
		else if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		else {
			System.out.println("plz pass the right browser...." + browser);
		}
		
		int a = 20;
		if (a == 10) { // false
			System.out.println("Hi");
		} else {
			System.out.println("bye");
		}

		int x = 100;
		int y = 100;

		if (x == y) { // true
			System.out.println("testing");
		}

		if (true) {
			System.out.println("Hello selenium");
		} else {// dead code
			System.out.println("bye selenium");
		}

		// --------------------//

		boolean flag = true;

		if (flag) {
			System.out.println("Hello selenium");
		} else {
			System.out.println("bye selenium");
		}

		//
		int g = 100;
		int h = 200;
		if (h >= g) {// true
			System.out.println("h is gr than g");
		} else {
			System.out.println("g is gr than h");
		}

		// WAP three diff values ---> max value

		int X = 700;
		int Y = 900;
		int Z = 600;
		// && -- short circuit operator
		// true && true && false && true && true
		if (X > Y && X > Z) { // false && true = false
			System.out.println("X is the greatest");
		} else if (Y > Z) {// true
			System.out.println("Y is the greatest");
		} else {
			System.out.println("Z is the greatest");
		}


	}

}
