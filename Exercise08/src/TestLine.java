public class TestLine
{
    public static void main(String[] args)
    {
        Point begin1 = new Point(-2, -1);
        Point end1 = new Point(10, 3);
        Line l1 = new Line(begin1, end1);
        Line l2 = new Line(2, -15, -2, 6);
    
        System.out.println("l1: " + l1.toString());
        System.out.println("l2: " + l2.toString());
    
        System.out.println(l1.getLength());
        System.out.println(l1.getGradient());
    
        System.out.println(l2.getLength());
        System.out.println(l2.getGradient());
    }
}
