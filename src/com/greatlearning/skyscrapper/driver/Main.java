package com.greatlearning.skyscrapper.driver;

import java.util.Scanner;
import java.util.Stack;

import com.greatlearning.skyscrapper.constructskyscrapper.ConstructSkyScrapper;

/* DRIVER CLASS */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the total number of floors in the building: ");
		int floorSize = 0;
		int totalFloors = 0;
		// TRY CATCH BLOCK TO HANDLE INPUT MISMATCH EXCEPTION
		try
		{
			totalFloors = sc.nextInt();
		}
		catch (java.util.InputMismatchException e)
		{
			System.out.println("Invalid input. Please enter an integer for the size.");
			System.exit(1);
		}
		
		// USING STACK DATA STRUCTURE FOR THE SOLUTION
		Stack<Integer> availableFloors = new Stack<Integer>();
		for (int day = 1; day <= totalFloors; day ++)
		{
			System.out.println ("Enter the floor size given on day " + day + ": ");
			// TRY CATCH BLOCK TO HANDLE INPUT MISMATCH EXCEPTION
			try
			{
				floorSize = sc.nextInt();
			}
			catch (java.util.InputMismatchException e)
			{
				System.out.println("Invalid input. Please enter an integer for the size.");
				System.exit(1);
			}
			availableFloors.push(floorSize);
		}
		/* CALLING ACTUAL METHOD TO ASSEMBLE FLOORS TO CONSTRUCT SKYSCRAPPER */
		ConstructSkyScrapper.assemblingFloors(availableFloors, totalFloors);
		sc.close();
	}

}
