package com;

import java.util.Scanner;

public class AreaDemo {
	private static final double pi=Math.PI;
	
	//Find the Area of a circle
	public static double areaOfCircele(double radious){
		if(radious<0){
			return -1;
		}else{
			return pi*Math.pow(radious, 2);
		}
	}
	
	//find Volume of Sphere
	public static double volumeOfSphere(double radious){
		if(radious<0){
			return -1;
		}else{
			return (4/3)*pi*Math.pow(radious, 3);
		}
	}
	
	//find Volume of Cylinder
	public static double volumeOfCylinder(double radious,double height ){
		if(radious<0 || height<0){
			return -1;
		}else{
			return pi*Math.pow(radious, 2)*height;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double radOFCicle;
		System.out.println("Enter the radious of Circel:");
		radOFCicle=sc.nextDouble();
		
		double radOfSphere;
		System.out.println("Enter the radious of Sphere:");
		radOfSphere=sc.nextDouble();
		
		double radOfCylinder,heightOfCylinder;
		System.out.println("Enter the radious and height of Cylinder:");
		radOfCylinder=sc.nextDouble();
		heightOfCylinder=sc.nextDouble();
		
		System.out.println("Area of Cicrcle is: "+AreaDemo.areaOfCircele(radOFCicle));
		System.out.println("Volume of Sphere is: "+AreaDemo.volumeOfSphere(radOfSphere));
		System.out.println("Volume of Cylinder is: "+AreaDemo.volumeOfCylinder(radOfCylinder, heightOfCylinder));

	}

}
