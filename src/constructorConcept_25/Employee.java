package constructorConcept_25;

public class Employee {
	// instance variables
    String name;
    int id;
    double salary;

    // constructors

    // const name is same as the class name
    // does not have any return type / no void
    // const.. can not return anything
    // const.. is not made for the bus logic
    // const.. is helping to initialize the class variables
    // const.. is restricting the unnecessary object creating
    // const.. will be called after creating the object

    public Employee() { // 0 param
        System.out.println("default const...");
    }

    public Employee(int a) { // 1 param
        System.out.println("1 param const..." + a);
    }

    public Employee(String name) {
        this.name = name;
        // this.G = L
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // method
    public void test() { // NS - create the object
        System.out.println("test method");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Tom");
        e1.test();

        System.out.println(e1.name);
        System.out.println(e1.name + " " + e1.id + " " + e1.salary);

        Employee e2 = new Employee("Kiran", 200);
        e2.salary = 45.55;
        e2.name = "Kiran Automation";
        System.out.println(e2.name + " " + e2.id + " " + e2.salary);

        Employee e3 = new Employee("Rahul", 201, 23.44);
        System.out.println(e3.name + " " + e3.id + " " + e3.salary);

        Employee e4 = new Employee(null, 0, 0.0);
    }

}
