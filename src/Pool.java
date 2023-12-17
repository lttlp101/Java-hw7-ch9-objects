
//
// ------------------------------------------
/*
    @brief This Program:
    This Java program defines the class Pool based on the following:

    The class should have private instance fields to store the shape of a pool (oval,
    rectangular, etc.), length (in feet), width (in feet), depth (in feet), area (in square feet)
    and the volume (in cubic feet) of the pool. Also provide the following methods:
        • A no-arg constructor to initialize the instance variables to values of your choice.
        • A Constructor with parameters to initialize the instance variables to the arguments
          indicated in the parameter list of the constructor. I like this constructor to accept as
          parameters the shape, length, width, and depth of the pool and set the values for
          member fields, accordingly.
        • Appropriate methods to set the value of each of the private instance fields.
        • Appropriate methods to get the value of each of the private instance fields.
        • A method to calculate and return the area of the pool. The area is calculated by
          multiplying length and width. So, area = length * width
        • A method to calculate and return the volume of the pool. The volume is calculated by
          multiplying depth by length and width. So, volume = length * width * depth
        • A method to display the values of all the variables. This is just a method with a bunch
          of output statements for all the instance variables.
        • A toString() method used to display the values of an object.

 */
//
// ------------------------------------------
/*
    @note
    UML Diagram for Pool class
    ----------------------
    Pool
    ----------------------
    - shape: String
    - length: double
    - width: double
    - depth: double
    - area: double
    - volume: double
    ----------------------
    + Pool()
    + Pool(shape: String, length: double, width: double, depth: double)
    ----------------------
    + setShape(shape: String): void
    + setLength(length: double): void
    + setWidth(width: double): void
    + setDepth(depth: double): void
    + setArea(length: double, width: double): void
    + setVolume(length: double, width: double, depth: double): void
    + getShape(): String
    + getLength(): double
    + getWidth(): double
    + getDepth(): double
    + getArea(): double
    + getVolume(): double
    + calArea(length: double, width: double): double
    + calVolume(length: double, width: double, depth: double): double
    + toString(): String
    + display(): void
    ----------------------
 */
//
// ------------------------------------------
//
//


import java.text.DecimalFormat;

@SuppressWarnings("java:S106") // Disable the warning about System.out from SonarLint

// Define the Pool class object
public class Pool {
    // Data Fields
    // Properties
    // Attributes
    // Define the data for the Object
    private String shape;
    private double length;
    private double width;
    private double depth;
    private double area;
    private double volume;


    // Constructors

    // No-arg Constructor that sets an initiate value for each type
    public Pool() {
        this.shape = "";
        this.length = 0.0;
        this.width = 0.0;
        this.depth = 0.0;
        this.area = 0.0;
        this.volume = 0.0;
    } // No-arg Constructor

    // Arg Constructor
    // that defines the Shape, the Length, the Width, the Depth,
    // and Calls setArea() and setVolume() to define the Area and the Volume based on the inputs
    public Pool(String shape, double length, double width, double depth) {
        // Define the Shape
        // Capitalize the first letter for the value of the Shape
        this.shape = shape.substring(0, 1).toUpperCase() + shape.substring(1);

        // Define the Length, Width and Depth
        this.length = length;
        this.width = width;
        this.depth = depth;

        // Calls setArea() and setVolume()
        setArea();
        setVolume();

    } // Arg Constructor


    // Methods

    // Setters

    // Set the Shape
    ///setShape -
    ///@param - shape [String]
    ///return: None
    public void setShape(String shape) {  //method header
        this.shape = shape;
    } // setShape

    // Set the Length
    ///setLength -
    ///@param - length [double]
    ///return: None
    public void setLength(double length) {  //method header
        this.length = length;
    } // setLength

    // Set the Width
    ///setWidth -
    ///@param - width [double]
    ///return: None
    public void setWidth(double width) {  //method header
        this.width = width;
    } // setWidth

    // Set the Depth
    ///setDepth -
    ///@param - depth [double]
    ///return: None
    public void setDepth(double depth) {  //method header
        this.depth = depth;
    } // setDepth

    // Set the Area
    ///setArea -
    ///@param - None
    ///return: None
    public void setArea() {  //method header
        // Call the calArea() method
        this.area = calArea(length, width);
    } // setArea

    // Set the Volume
    ///setVolume -
    ///@param - None
    ///return: None
    public void setVolume() {  //method header
        // Call the calVolume() method
        this.volume = calVolume(length, width, depth);
    } // setVolume


    // Getters

    // Get the Shape
    ///getShape -
    ///@param - None
    ///return: the value [String type] of the Shape
    public String getShape() {  //method header
        return shape;
    } // getShape

    // Get the Length
    ///getLength -
    ///@param - None
    ///return: the value [double type] of the Length
    public double getLength() {  //method header
        return length;
    } // getLength

    // Get the Width
    ///getWidth -
    ///@param - None
    ///return: the value [double type] of the Width
    public double getWidth() {  //method header
        return width;
    } // getWidth

    // Get the Depth
    ///getDepth -
    ///@param - None
    ///return: the value [double type] of the Depth
    public double getDepth() {  //method header
        return depth;
    } // getDepth

    // Get the Area
    ///getArea -
    ///@param - None
    ///return: the value [double type] of the Area
    public double getArea() {  //method header
        return area;
    } // getArea

    // Get the Volume
    ///getVolume -
    ///@param - None
    ///return: the value [double type] of the Volume
    public double getVolume() {  //method header
        return volume;
    } // getVolume


    // Other Methods

    // Calculate the Area
    ///calArea
    ///@param - length [double] the Length value
    ///@param - width [double] the Width value
    ///return: the value [double type] of the Area based on the formula
    public double calArea(double length, double width) {  //method header
        return length * width;
    } // calArea

    // Calculate the Volume
    ///calVolume - Calculate the Volume based on the formula
    ///@param - length [double] the Length value
    ///@param - width [double] the Width value
    ///@param - depth [double] the Depth value
    ///return: the value [double type] of the Volume
    public double calVolume(double length, double width, double depth) {  //method header
        return length * width * depth;
    } // calVolume

    // toString() Method
    // Display the object outputs
    ///toString - Display the formatted object data by overriding the toString() method
    ///@param - None
    ///return: the String type of the formatted object data
    @Override
    public String toString() {  //method header

        // Use DecimalFormat class to set up the 2 digits decimal point for double type value
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        return "The Shape of the Pool is a " + shape + ". \n" +
                "The Length of the Pool is " + decimalFormat.format(length) + " feet. \n" +
                "The Width of the Pool is " + decimalFormat.format(width) + " feet. \n" +
                "The Depth of the Pool is " + decimalFormat.format(depth) + " feet. \n" +
                "The Area of the Pool is " + decimalFormat.format(area) + " square feet. \n" +
                "The Volume of the Pool is " + decimalFormat.format(volume) + " cubic feet. \n" +
                "\n";
    } // toString

    // display() Method
    // Display the output variables
    ///display - Display all the variables
    ///@param - None
    ///return: None
    public void display() {  //method header
        // Print out all the variable by calling all the getters methods
        System.out.printf("The Shape of the Pool is a %s. %n", getShape());
        System.out.printf("The Length of the Pool is %.2f feet. %n", getLength());
        System.out.printf("The Width of the Pool is %.2f feet. %n", getWidth());
        System.out.printf("The Depth of the Pool is %.2f feet. %n", getDepth());
        System.out.printf("The Area of the Pool is %.2f square feet. %n", getArea());
        System.out.printf("The Volume of the Pool is %.2f cubic feet. %n%n", getVolume());
    } // display

}
