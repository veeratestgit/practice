package geometry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(4.0, 6.0));
        shapes.add(new Triangle(3.0, 8.0));

        for (Shape shape : shapes) {
            try {
                shape.displayArea();
            } catch (Exception e) {
                System.err.println("An error occurred: " + e.getMessage());
            } finally {
                System.out.println("Finished calculating area.");
            }
        }
    }
}
