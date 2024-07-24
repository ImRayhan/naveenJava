package naveen.Java;

public class Car_19 {
	String name;
	int price;
	String chasisNumber;
	static final int wheels=4;
	
	public static void main(String[] args) {

		Car_19 c1 = new Car_19();
		c1.name = "BMW";
		c1.price = 50;
		c1.chasisNumber = "12121BMW";
		
		Car_19 c2 = new Car_19();
		c2.name = "Audi";
		c2.price = 60;
		c2.chasisNumber = "121666AUDI";
		
		Car_19 c3 = new Car_19();
		c3.name = "Honda";
		c3.price = 10;
		c3.chasisNumber = "12122wwHONDA";
		
		//Car.wheels = 5;

		//how to call static vars:
		//1. use directly: within the same class
		System.out.println(wheels);
		System.out.println(c1.name + " " + c1.price + " " + c1.chasisNumber + " " + wheels);
		
		//2. use it with the class name: from anywhere
		System.out.println(Car_19.wheels);
		System.out.println(c1.name + " " + c1.price + " " + c1.chasisNumber + " " + Car_19.wheels);


		//3. can I call static var with object ref name??
		System.out.println(c1.wheels);//not recommended
		
		
	}

}
