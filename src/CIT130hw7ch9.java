
//
// ------------------------------------------
/*
    @brief This Program:
    This Java program include the following:
    This is the Main program
    To test various operations on the objects of the Pool class.
    Perform a series of operations to test each of the methods and the constructors.
    In addition, show how to define an array of pool objects from the Pool class
    and show the functionality of the class with your array.

 */
//
// ------------------------------------------
//
//


import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("java:S106") // Disable the warning about System.out from SonarLint

public class CIT130hw7ch9 {

    // Define the scanner object to take input
    public static final Scanner inputs = new Scanner(System.in);
    // Create random object
    public static final Random randomNumber = new Random();


    public static void main(String[] args) {
        // Display the assignment title
        System.out.println("\nAssignment 7   Objects and Classes -- OOP\n");

        // Call createNoArgConstructorObject method
        createNoArgConstructorObject();

        // Call createArgsConstructorObject method
        createArgsConstructorObject();

        // Call createInputtedObject method
        createInputtedObject();

        // Call createArraysInputtedObject method
        createArraysInputtedObject();

    } // main


    // Operation 1
    // createNoArgConstructorObject
    // No-Arg Constructor
    public static void createNoArgConstructorObject() {
        // Display Demo 1
        System.out.println("1) Create a default Pool object with No-Arg Constructor \n");

        // No arg Pool object #1
        Pool pool1 = new Pool();

        // Print the Pool #1's data
        System.out.println("This is the default initiate Pool object with NO Args \n");
        System.out.println(pool1);

    } // createNoArgConstructorObject


    // Operation 2
    // createArgsConstructorObject
    // Args Constructor
    public static void createArgsConstructorObject() {
        // Display Demo 2
        System.out.println("2) Create a Pool object with Args Constructor \n");

        // Define Pool #2, and Pool #3 with specified Length, Width and Depth values
        // Create random Length, Width and Depth values by calling random() method
        Pool pool2 = new Pool("Oval", randomNum(), randomNum(), randomNum());
        Pool pool3 = new Pool("Rectangular", randomNum(), randomNum(), randomNum());

        // Display message
        System.out.println("This are the default initiate Pool objects with Args \n");

        // Print the Pool #2's data, using toString() method
        System.out.println(pool2);

        // Print the Pool #3's data, using display() method
        pool3.display();

    } // createArgsConstructorObject


    // Operation 3
    // createInputtedObject
    // One Pool object with user Inputs
    public static void createInputtedObject() {
        // Display Demo 3
        System.out.println("3) Create a Pool object with user Inputs \n");

        // Now inform the user that a new Pool is being created
        System.out.println("We are now creating a new pool.");

        // Create the Pool object with the given inputs
        // Calling the getPoolInfo() method
        Pool pool4 = getPoolInfo();

        System.out.println("\nThe data for the Pool you just created is as follows... \n");

        // Display outputs using toString() method
        System.out.println(pool4);

    } // createInputtedObject


    // Operation 4
    // createArraysInputtedObject
    // Pool Array objects with user Inputs
    public static void createArraysInputtedObject() {
        // Display Demo 4
        System.out.println("4) Create a Pool Array of objects with user Inputs ");
        // Now inform the user that a new Pool Array is being created
        System.out.println("\nWe are creating Pool Array ");

        // Ask the user for the Number of Pool objects
        System.out.println("How many pools to process in the pool array? ");

        // Get the input for the Number of the Pool Objects
        int numberOfPool = inputs.nextInt();

        // Validate the Number of the Pool Objects
        while (numberOfPool <= 0) {
            System.out.println("Invalid!! Enter again!");
            numberOfPool = inputs.nextInt();
        }

        // Create the Array of Pools based on the input of amount of Pool object
        Pool[] poolArray = new Pool[numberOfPool];

        // For Loop for each Pool object
        for (int i = 0; i < numberOfPool; i++) {

            inputs.nextLine(); // Skip the line input

            // Create the Pool object with the given inputs
            // Calling the getPoolInfo() method
            poolArray[i] = getPoolInfo();

            // Display the outputs
            // Display header
            System.out.println("\nThe data for pool " + (i+1) + " \n");

            // Option 1, Using display() Method
            // poolArray[i].display();

            // Option 2, Using toString() Method
            System.out.println(poolArray[i]);

        } // For Loop
    } // createArraysInputtedObject


    // Random Number
    ///randomNum - Create a random number
    ///@param - None
    ///return: a double type of random number
    public static double randomNum() {  // Method Header
        // Set the range (1 - 100)
        double min = 1.0;
        double max = 100.0;

        // Return the random number
        return min + randomNumber.nextDouble() * (max - min);

    } // randomNum


    // Get User Inputs to Create Pool Object
    ///getPoolInfo - Get user inputs to create pool object
    ///@param - None
    ///return: a Pool object
    public static Pool getPoolInfo() {  // Method Header
        // Ask user for the Shape of the Pool object being created
        System.out.println("Enter the shape of a pool: ");
        String newShape = inputs.nextLine();

        // Ask user for the Length of the Pool object being created
        System.out.println("Enter the length of a pool: ");
        double newLength = inputs.nextDouble();

        // Validate the Length of the Pool object
        while (newLength <= 0.00000000001) {
            System.out.println("Invalid!! Enter again!");
            newLength = inputs.nextDouble();
        }

        // Ask user for the Width of the Pool object being created
        System.out.println("Enter the width of a pool: ");
        double newWidth = inputs.nextDouble();

        // Validate the Width of the Pool object
        while (newWidth <= 0.00000000001) {
            System.out.println("Invalid!! Enter again!");
            newWidth = inputs.nextDouble();
        }

        // Ask user for the Depth of the Pool object being created
        System.out.println("Enter the depth of a pool: ");
        double newDepth = inputs.nextDouble();

        // Validate the Depth of the Pool
        while (newDepth <= 0.00000000001) {
            System.out.println("Invalid!! Enter again!");
            newDepth = inputs.nextDouble();
        }

        // Return the Pool object with the given inputs
        return new Pool(newShape, newLength, newWidth, newDepth);

    } // getPoolInfo


}