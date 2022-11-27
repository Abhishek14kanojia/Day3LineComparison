package com.day3LineComparison;

public class Line {

	static Point p1;
	static Point p2;
	static Point p3;
	static Point p4;

		public static float getlength() {
			return (float)Math.sqrt(Math.pow((p1.x - p2.x),2)+Math.pow((p1.y - p2.y),2));
			
		}
		
		public static float length() {
			return (float)Math.sqrt(Math.pow((p3.x - p4.x),2)+Math.pow((p3.y - p4.y),2));

		}
	
}
