package operator;

public class ComparativeOperator {
	public static void main(String[] args) {
		int i = 10;
		int j = 50;
		
		int l = 50;
		//1.equal operator
		boolean k = i==j;
		System.out.println(k);//false
		boolean n= j==1;
		System.out.println(n);//true
		//2.'>' greater than
		boolean o = j>i;
		System.out.println(o);//true
		//3.','
		boolean p= i<j;
		System.out.println(p);//true
		//4.'>='
		boolean q= i>=1;
		System.out.println(q);//true
		//5.'<='
		boolean r= j<=1;
		System.out.println(r);//false
		
		
	
}


}


