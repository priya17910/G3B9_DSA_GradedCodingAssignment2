package com.greatlearning.skyscrapper.constructskyscrapper;

import java.util.Stack;

/* CLASS CONTAINING ACTUAL METHOD TO ASSEMBLE FLOORS */
public class ConstructSkyScrapper {
	public static void assemblingFloors (Stack<Integer> availableFloors, int numOfFloors)
	{
		Stack<Integer> assembledFloors = new Stack<Integer>();
		int i = 0, maxValue = numOfFloors;
		System.out.println ("The order of construction is as follows ");
		
		/* ACTUAL LOGIC STARTS HERE */
		for (i = 0; i < numOfFloors && !availableFloors.isEmpty(); i++)
		{
			assembledFloors.add(availableFloors.get(i));
			System.out.println ("Day: " + (i + 1));
			while (!assembledFloors.isEmpty() && assembledFloors.peek() == maxValue)
			{
				System.out.print (assembledFloors.pop() + " ");
				maxValue --;
			}
			System.out.println ();
		}
		/* ACTUAL LOGIC ENDS HERE */
	}
}