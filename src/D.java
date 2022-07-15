package accesshomework;

import polymorphism.A;

public class D extends E {
	public void m9() {

		a.m1();
		b.m5();
		c.m8();
	}
	public static void main(String[] args) {
		D d = new D();
		d.m9();
		d.m10();
		
		
	}
	
	public void m10() {
	
		a.m3();
		b.m4();
		c.m7();
		g.m12();

	}

}
