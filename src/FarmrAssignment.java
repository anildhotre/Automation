package categoriesofmethod;

public class FarmrAssignment {
	public static int areacalculator() {
		int length = 50;
		int breadth = 20;
		int area = length* breadth;
		return area;
	}
	public static int areacalculator2() 
	{
		int length = 60;
		int breadth = 20;
		int area = length * breadth;
		return area;
}
	public static int areacalculator3() 
{
	int length = 40;
	int breadth = 20;
	int area = length * breadth;
	return area;
}
	public static void main(String[] args) {
		int area1 = areacalculator();
		int area2 = areacalculator2();
		int area3 = areacalculator3();
		int totalarea = area1 + area2 + area3;
		System.out.println(totalarea);
		
	
}



}
