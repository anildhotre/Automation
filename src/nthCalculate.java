package coreJava;

public class nthCalculate {
public static void main(String[] args) {
	String s = "pennysylvania";
	char search = 'n';
	int count = 0;
	for(int i = 0; i<s.length(); i++) 
	{
		if(s.charAt(i)==search) 
		{
            count++;
	}
		System.out.println("The string contains 'n' for this times : "+count);
}
}
}
