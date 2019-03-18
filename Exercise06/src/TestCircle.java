public class TestCircle
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.0);
        Circle c3 = new Circle(3.0, "blue");
        
        printVars(c1);
        printVars(c2);
        printVars(c3);
        
        c2.setRadius(2.5);
        c2.setColor("yellow");
        printVars(c2);
    
        System.out.println(c2.compareArea(c3));
        System.out.println(c3);
        
        Circle.shapesCreated();
    }
    
    private static void printVars(Circle C)
    {
        System.out.println("Radius: " + C.getRadius() + "; Area: " + C.getArea() + "; Color: " + C.getColor());
    }
}
