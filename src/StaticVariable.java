package variable;

public class StaticVariable {
	
	
		static int a = 50;
		public static void main(String[] args) {
			System.out.println(a);
			System.out.println(StaticVar22.s);
			
		}
		public static void m1() {
			System.out.println(a);
			System.out.println(StaticVar22.s);
		}
		public void m2() {
			System.out.println(a);
		}
		
	
}


