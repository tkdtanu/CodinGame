package com;


public class PointDemo { 
	public static Point addPoint(Point p1,Point p2){
		Point result=new Point();
		
		result.setXcoordinate(p1.getXcoordinate()+p2.getXcoordinate());
		result.setYcoordinate(p1.getYcoordinate()+p1.getYcoordinate());
		
		return result;
	}
	public static Point subtractPoint(Point p1,Point p2){
		Point result=new Point();
		
		result.setXcoordinate(p1.getXcoordinate()-p2.getXcoordinate());
		result.setYcoordinate(p1.getYcoordinate()-p1.getYcoordinate());
		
		return result;
	}

	public static void main(String[] args) {
		Point p1=new Point();
		Point p2=new Point();
		
		p1.setXcoordinate((float) 10.4);
		p1.setYcoordinate((float) 12.4);
		
		p2.setXcoordinate((float) 7.4);
		p2.setYcoordinate((float) 8.4);
		
		Point addedPoint=addPoint(p1, p2);
		Point subPoint=subtractPoint(p1, p2);
		
		System.out.println("Added Point: "+addedPoint.getXcoordinate()+" "+addedPoint.getYcoordinate());
		System.out.println("Subtracted Point: "+subPoint.getXcoordinate()+" "+subPoint.getYcoordinate());

	}

}
