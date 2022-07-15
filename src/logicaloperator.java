package operator;

public class logicaloperator {
	public static void main(String[] args) {
		//logical and operator....>&&
		int i = 10;
		boolean j = i>=5;
		boolean k = i==10;
		boolean l = j && k;
		System.out.println(l);//true
		//OR operator.....>||
		boolean y = i==5;
		boolean z = i>=10;
		boolean w = y || z;
		System.out.println(w);//true
		//NOToperator...logical not operator...>!
		int h =50;
		boolean m = h>50;
		System.out.println(m);//false
		boolean n =  !m;
		System.out.println(n);//true
		boolean o = !(i>=50);
		System.out.println(o);//true
		boolean u = i!=50;
		System.out.println(u);//true
		
		
	
}

}
