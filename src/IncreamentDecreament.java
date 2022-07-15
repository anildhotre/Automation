package operator;

public class IncreamentDecreament {
	public static void main(String[] args) {
		int x=10;
		//pre-increment
		int y =++x;
		System.out.println(y);
		System.out.println(x);
		//post-increment
		int w=10;
		int z=w++;
		System.out.println(w);
		System.out.println(z);
		//pre-decrement
		int q= 10;
		int p=--q;
		System.out.println(q);
	    System.out.println(p);
	    //post-decrement
	    int e= 10;
	    int f= e--;
	    System.out.println(e);
	    System.out.println(f);
}
	

}
