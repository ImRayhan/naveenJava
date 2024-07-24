package naveen.Java;

public class Language_24 {

	public static void useLang(Language_24 obj) {
		System.out.println("use this lang");
		// obj=null;
		obj.readLang();
	}

	public void readLang() {
		System.out.println("read lang");
	}

	public static void main(String[] args) {
		Language_24 lg = new Language_24();
		lg.readLang();
		Language_24.useLang(lg);
	}

	// POM -- page chaining model -- supply Webdriver driver

}
