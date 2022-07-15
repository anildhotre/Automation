package method;

public class NonStaticMethod {
	public static void main(String[] args) {
		 NonStaticMethod nsm = new NonStaticMethod();
	       nsm.m1();
	       nsm.m2();
	       NonStaticMethod22 var2 = new NonStaticMethod22();
	       var2.methodThree();
	       
	      
	    		   
}
	public void m1() 
	{
		System.out.println("m1 method");
	}
	public void m2() 
	{
		System.out.println("m2 metohd");
		
		
	}
	

}
