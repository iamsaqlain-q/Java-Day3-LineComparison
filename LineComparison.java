package com.bl.day3;
import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {

//Master Branch
		System.out.println("Welcome to Line Comparison Computation Program");
		
//UC1-model a line based on a point consisting of (x, y) co-ordinates using the Cartesian system, So that I can calculate its length.
        int xOneLineOne, xTwoLineOne, yOneLineOne, yTwoLineOne, xOneLineTwo, xTwoLineTwo, yOneLineTwo, yTwoLineTwo;
        double length1, length2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the end points of line one ");
        
//Enter end points of line 1
  
		System.out.println("Enter x1 : ");
		xOneLineOne = sc.nextInt();
		System.out.println("Enter y1 : ");
		yOneLineOne = sc.nextInt();
		
		System.out.println("Enter x2 : ");
		xTwoLineOne = sc.nextInt();
		System.out.println("Enter y2 : ");
		yTwoLineOne = sc.nextInt();
		length1 = Math.sqrt((Math.pow((xTwoLineOne-xOneLineOne), 2)+Math.pow((yTwoLineOne-yOneLineOne), 2)));
		System.out.println("Length of the Line is : " + length1);
		
		System.out.println("Enter the end points of line two ");
        
		//Enter end points of line 2
		  
				System.out.println("Enter x1 : ");
				xOneLineTwo = sc.nextInt();
				System.out.println("Enter y1 : ");
				yOneLineTwo = sc.nextInt();
				
				System.out.println("Enter x2 : ");
				xTwoLineTwo = sc.nextInt();
				System.out.println("Enter y2 : ");
				yTwoLineTwo = sc.nextInt();
				length2 = Math.sqrt((Math.pow((xTwoLineTwo-xOneLineTwo), 2)+Math.pow((yTwoLineTwo-yOneLineTwo), 2)));
				System.out.println("Length of the Line is : " + length2);
		
		
//UC2-check equality of two lines based on the end points, whether two lines are the equal or not
				Double line1 = new Double(length1);
				Double line2 = new Double(length2);
				if (line1.equals(line2))
		            System.out.print("Line 1 and line 2 have Equal lengths.");
		        else
		            System.out.print("Line 1 and Line 2 do not have Equal lengths.");
			}
        
	}
