package stringdiscussion;

public class arrayExample {
	public static void m1(int[] a) {
		a[0] = 10;
		for(int i:a) {
			System.out.println(i);
		}
	}
   public static void main(String[] args) {
	   int[] f = new int[5];
		f[0]=80;
		f[1]=40;
		f[2]=62;
		f[3]=34;
		f[4]=68;
	     m1(f);
}
}
