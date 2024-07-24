package naveen.Java;

public class Employee_16_1 {
	// class vars: class attributes
		String name;
		int empId;
		String dept;
		boolean isPerm;
		double salary;

		public static void main(String[] args) {

			int i = 10;// local var --> 4 bytes --> primitive
			System.out.println(i);

			// class: is a blueprint/template/category of the objects
			// Object/Instance: is a physical entity created from class template/category

			// new keyword

			Employee_16_1 e1 = new Employee_16_1();
			// Employee : class/ type of e1
			// e1: object reference variable
			// new : keyword
			// new Employee(): Object

			e1.name = "Rahul";
			e1.empId = 1;
			e1.dept = "QA";
			e1.isPerm = true;
			e1.salary = 23.44;

			System.out.println(e1.name);
			System.out.println(e1.empId);
			System.out.println(e1.dept);
			System.out.println(e1.isPerm);
			System.out.println(e1.salary);

			Employee_16_1 e2 = new Employee_16_1();
			e2.name = "Tom";
			e2.empId = 2;
			e2.salary = 12.33;

			System.out.println(e2.name);
			System.out.println(e2.empId);
			System.out.println(e2.dept);
			System.out.println(e2.isPerm);
			System.out.println(e2.salary);
			
			
			//No ref object:
			new Employee_16_1().name = "Ravi";
			new Employee_16_1().empId = 3;
			
			//null ref object
			Employee_16_1 e3 = new Employee_16_1();
			e3 = null;
			e3.name = "Naveen";//NPE
			//null. ---> NPE
			
			System.gc();//no guarantee that GC will go to heap memory
			
		
			Employee_16_1 e5;//stack
			
			e5 = new Employee_16_1();
			
			
			
			
			
			
		}

}
