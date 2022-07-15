package categoriesofmethod;

public class FarmerAssignment22 {
	public static int areacalculator(int length, int breadth)
	{
		int area = length*breadth;
		return area;
		
	}
	public static void main(String[] args)
	{
		int area1 = areacalculator(50,10);
		int area2 = areacalculator(10,20);
		int area3 = areacalculator(40,60);
		int totalarea = area1+area2+area3;
		System.out.println(totalarea);
		
	}

}
