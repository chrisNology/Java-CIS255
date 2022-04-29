package Assign8;

import java.util.Scanner;

public class CarpetCalculator {

	public static void main(String[] args) 
	{
		// Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Display information about program. 
        System.out.println("This program will display price to carpet a room." + 
                           "\nYou must input the room's dimensions in feet.\n");

        // Get the length of the room.
        System.out.print("Enter the length first: ");
        double length = keyboard.nextDouble();

        // Get the width of the room.
        System.out.print("Now enter the width: ");
        double width = keyboard.nextDouble();

        // Get the cost of price per square feet of the desired carpeting.
        System.out.print("Enter the price per square feet for the desired carpeting: ");
        double carpetCost = keyboard.nextDouble();

        //Close keyboard
        keyboard.close();

        // Create RoomDimension and RoomCarpet objects.
        RoomDimension dimensions = new RoomDimension(length, width);
        RoomCarpet roomCarpet = new RoomCarpet(dimensions, carpetCost);

        // Print the object calling the toString
        System.out.println(roomCarpet);
	}

}
