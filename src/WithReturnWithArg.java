package categoriesofmethod;

public class WithReturnWithArg {
	public static String m1(String name,int roll) {
		System.out.println("with return and with arg");
		String anil = name + roll;
		return "anil";
		
	}
	public static void main(String[] args) {
		String value = m1("Elder", 50);
		System.out.println(value);
		String val1 = value+"pune";
		System.out.println(val1);
		
		
	}

}
