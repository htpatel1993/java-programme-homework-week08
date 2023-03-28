package programme_19_cylinder;

/**
 * 3. Write a class with the name Main that have main method
 * TEST EXAMPLE
 * → TEST CODE: Write below code into main method
 * Circle Circle = new Circle(3.75);
 * System.out.println("circle.radius= " + circle.getRadius());
 * System.out.println("circle.area= " + circle.getArea());
 * Cylinder cylinder = new Cylinder(5.55, 7.25);
 * System.out.println("cylinder.radius= " + cylinder.getRadius());
 * System.out.println("cylinder.height= " + cylinder.getHeight());
 * System.out.println("cylinder.area= " + cylinder.getArea());
 * System.out.println("cylinder.volume= " + cylinder.getVolume());
 */

public class Main {
    //main method

    public static void main(String[] args) {


        Circle circle = new Circle(3.75); // calling a  constructor
        System.out.println("Circle.radius = " + circle.getRadius()); // calling an instance method  of a circle class
        System.out.println("Circle.Area = " + circle.getArea()); // calling an instance method of a circle class
        Cylinder cylinder = new Cylinder(5.55, 7.25); // creating an object
        System.out.println("Cylinder.radius = " + cylinder.getRadius());  // calling an instance method from cylinder class
        System.out.println("Cylinder.height = " + cylinder.getHeight()); // calling an instance method from cylinder class
        System.out.println("Cylinder.area = " + cylinder.getArea()); // calling an instance method from cylinder class
        System.out.println("Cylinder.volume = " + cylinder.getVolume()); // calling an instance method from cylinder class
    }

}
