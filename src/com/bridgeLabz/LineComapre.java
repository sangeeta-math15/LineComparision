package com.bridgeLabz;


class Equal
{
	int x1, y1, x2, y2;
	int x3, y3, x4, y4;

	void insert(int p, int q, int r, int s, int a, int m, int n, int o)
	{
		x1 = p;
		y2 = q;
		x2 = r;
		y2 = s;
		x3 = a;
		y3 = m;
		x4 = n;
		y4 = o;

	}

	double checkDistanceOne()
	{
		double dis1 = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("first line distance===>" + dis1);

		return dis1;
	}

	double checkDistanceTwo() 
	{

		double dis2 = (int) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

		System.out.println("Second line distance===>" + dis2);
		return dis2;
	}

}


public class LineComapre {

	public static void main(String[] args) {
		System.out.println("Welcome to line comparision computation on master branch");
	
		
	Equal equal = new Equal();

	equal.insert(10, 20, 30, 40, 50, 60, 70, 80);
	
	//Equal equal1 = new Equal();
	//equal1.insert(10, 20, 30, 40, 50, 60, 70, 80);
	
	Double line1 = equal.checkDistanceOne();
	Double line2 = equal.checkDistanceTwo();
	boolean result1 = (line1.equals(line2));
	System.out.println(result1);
	int result = (line1.compareTo(line2));
	if (result > 0)
		System.out.println("line1 is greater than line2");
	else if (result < 0)
		System.out.println("line1 is less than line2");
	else
			System.out.println("line1 is equal to line2");

		
 }
}
