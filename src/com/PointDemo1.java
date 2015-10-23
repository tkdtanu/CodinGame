package com;


public class PointDemo1 {
	
	public static double findDistance(Point p1,Point p2){
		return Math.sqrt(Math.pow(p1.getXcoordinate()-p2.getXcoordinate(),2)+Math.pow(p1.getYcoordinate()-p2.getYcoordinate(),2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point();
		Point p2=new Point();
		
		p1.setXcoordinate((float) 10.4);
		p1.setYcoordinate((float) 12.4);
		
		p2.setXcoordinate((float) 7.4);
		p2.setYcoordinate((float) 8.4);
		System.out.println("Distance of two point is: "+(float)findDistance(p1, p2));

	}

}
