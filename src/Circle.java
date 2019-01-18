import java.util.Scanner; // Used for Obtaining inputs.
public class Circle {
    public static void main(String[] args){
        // Declare String Object
        System.out.print("Enter The Radius: "); //Taking user input for radius of circle
        Scanner scanner = new Scanner(System.in);
        double Radius= scanner.nextDouble(); //  scans the next token of the input as a double.
        double Area= Math.PI* (Radius*Radius);  //Area of a circle = PI*radius*radius
        System.out.format("The Area is: %.2f \n", Area);// Printing the area the circle to 2 decimal places.
        
        double Circumference= 2*Math.PI*(Radius); //Circumference of a circle= 2*PI*Radius 
        System.out.format("The Circumference is: %.2f", Circumference);//Printing the circumference of the circle to 2 decimal places.
        
        
    
}
}
