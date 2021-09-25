package com.bridgeLabz;

public class LineComapre {

	public static void main(String[] args) {
		System.out.println("Welcome to line comparision computation on master branch");
		int x1=5;
		int y1=3;
		int x2=2;
		int y2=3;
		int x3=5;
		int y3=2;
		int x4=1;
		int y4=2;
		
		

	int dis=(int) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

	System.out.println("first dist:"+dis);

	int dis2=(int) Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));

	System.out.println("sec distance:"+dis2);

	}

}
