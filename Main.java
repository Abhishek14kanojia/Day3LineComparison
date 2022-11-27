package com.day3LineComparison;

public class Main {

	public static void main(String[] args) {
		
		Line l1 = new Line();
		
		l1.p1 = new Point();
		l1.p1.x = 5;
		l1.p1.y = 10;
		
		l1.p2 = new Point();
		l1.p2.x = 15;
		l1.p2.y = 20;
		
		Line l2 = new Line();
		
		l2.p3 = new Point();
		l2.p3.x = 5;
		l2.p3.y = 10;
		
		l2.p4 = new Point();
		l2.p4.x = 15;
		l2.p4.y = 20;
		
		float length1 = l1.getlength();
		System.out.println(length1);
		
		float length2 = l2.getlength();
		System.out.println(length2);
		
		if(length1 == length2) {
			System.out.println("Line_and_Point_as_well_as_equals");
		}else {
			System.out.println("Line_and_Point_boths_are_not_equals");
		}
	}
	
}
