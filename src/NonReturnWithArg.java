package categoriesofmethod;

public class NonReturnWithArg {
	public static void m1(int i) {
		System.out.println("m1 method");
		int j = i+2;
		System.out.println("The valuu of j is:"+j);
	}
	public void m2(int a,int b) {
		int c = a+b;
		//the sum of value1 and value2 is:assigmnent add sub mult div
		System.out.println("The sum is:"+c);
	}
	public static void main(String[] args) {
		m1(80);
		m1(56);
		NonReturnWithArg nrwa = new NonReturnWithArg();
		nrwa.m2(50, 10);
		nrwa.m2(675, 876);
	}

}

