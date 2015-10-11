package com;

import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
	private static int minx=Integer.MIN_VALUE;
	private static int maxx=Integer.MAX_VALUE;
	public static class House{
		static int x=0;
		private static int y=0;
		private House(int a, int b) {
			x = a;
			y = b;
		}
		public static int getY() {
			return y;
		}
		public static void setY(int y) {
			House.y = y;
		}
	}

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int totalYPos=0;
        List<House> houses=new ArrayList<Solution.House>();
        for (int i = 0; i < N; i++) {
            int X = in.nextInt();
            int Y = in.nextInt();
            totalYPos+=Y;
            if(X<minx){minx=X;}
            if(X>maxx){maxx=X;}
            houses.add(new Solution.House(X, Y));
        }
        int CentreCablePos=totalYPos/houses.size();
        int centralCableLength=CentCabLength();
        int bestYpos=findBestYPos(houses,CentreCablePos);
        int eachHousetoCentre=calculatetotalVerticallength(houses,bestYpos);
        System.out.println(centralCableLength+eachHousetoCentre);

    }

	private static int calculatetotalVerticallength(List<House> houses,
			int bestYpos) {
		int totaldist=0;
		for(House house:houses){
			totaldist+=Math.abs(house.y-bestYpos);
		}
		return totaldist;
	}

	private static int findBestYPos(List<House> houses, int centreCablePos) {
		int bestYpos=houses.get(0).y;
		int mindiffTocentre=Math.abs(bestYpos-centreCablePos);
		for(int i=1;i<houses.size();i++){
			int diff=Math.abs(houses.get(i).y-centreCablePos);
			if(diff<mindiffTocentre){
				mindiffTocentre=diff;
				bestYpos=houses.get(i).y;
			}
		}
		// TODO Auto-generated method stub
		return bestYpos;
	}

	private static int CentCabLength() {
		return Math.abs(maxx-minx);
	}
}