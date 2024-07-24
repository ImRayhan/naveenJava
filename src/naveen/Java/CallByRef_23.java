package naveen.Java;

public class CallByRef_23 {
	
	public static void sendMail(CallByRef_23 a) {
		System.out.println("send mail");
		
		a.readMail();
	}

	public void readMail() {
		System.out.println("read mail");
		
	}

	public static void main(String[] args) {

		CallByRef_23 obj = new CallByRef_23();
		CallByRef_23.sendMail(obj);

	}

}
