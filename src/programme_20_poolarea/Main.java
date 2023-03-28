package programme_20_poolarea;

/**
 * 3. Write a class with the name Main that contains the main method.
 * TEST EXAMPLE
 * → TEST CODE: Write the below code into the main method.
 * Rectangle rectangle = new Rectangle(5, 10);
 * System.out.println("rectangle.width= " + rectangle.getWidth());
 * System.out.println("rectangle.length= " + rectangle.getLength());
 * System.out.println("rectangle.area= " + rectangle.getArea());
 * Cuboid cuboid = new Cuboid(5,10,5);
 * System.out.println("cuboid.width= " + cuboid.getWidth());
 * System.out.println("cuboid.length= " + cuboid.getLength());
 * System.out.println("cuboid.area= " + cuboid.getArea());
 * System.out.println("cuboid.height= " + cuboid.getHeight());
 * System.out.println("cuboid.volume= " + cuboid.getVolume());
 */

public class Main {
    //Main method
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10); // creating an object of rectangle class
        System.out.println("Rectangle.width =" + rectangle.getWidth()); // calling an instance method of rectangle class
        System.out.println("Rectangle.length =" + rectangle.getLength()); // calling an instance method of rectangle class
        System.out.println("Rectangle.Area =" + rectangle.getArea()); // calling an instance method of rectangle class
        Cuboid cuboid = new Cuboid(5, 10, 5); // creating an object of cuboid class
        System.out.println("Cuboid.width = " + cuboid.getWidth()); // calling an instance method of cuboid class
        System.out.println("Cuboid.length = " + cuboid.getLength()); // calling an instance method of cuboid class
        System.out.println("Cuboid.area = " + cuboid.getArea()); // calling an instance method of cuboid class
        System.out.println("Cuboid.height= " + cuboid.getHeight()); // calling an instance method of cuboid class
        System.out.println("Cuboid.Volume = " + cuboid.getVolume()); // calling an instance method of cuboid class
    }
}
