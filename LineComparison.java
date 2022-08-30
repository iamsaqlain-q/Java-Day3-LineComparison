package com.bl.day3;
import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {

       //Master Branch
		System.out.println("Welcome to Line Comparison Computation Program");
		
		//UC1-model a line based on a point consisting of (x, y) co-ordinates using the Cartesian system, So that I can calculate its length.
        int x1, x2, y1, y2;
        double length;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the end points of line ");
        
        //Enter end points of line 1
  
		System.out.println("Enter x1 : ");
		x1 = sc.nextInt();
		System.out.println("Enter y1 : ");
		y1 = sc.nextInt();
		
		//Enter end points of line 2
		
		System.out.println("Enter x2 : ");
		x2 = sc.nextInt();
		System.out.println("Enter y2 : ");
		y2 = sc.nextInt();
		length = Math.sqrt((Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2)));
		System.out.println("Length of the Line is : " + length);
        
	}
}
