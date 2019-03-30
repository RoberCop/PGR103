public class TestLineSub
{
    public static void main(String[] args)
    {
        LineSub ls1 = new LineSub(-1, -3, 3, 4);
        System.out.println(ls1.toString());
        
        ls1.setXY(-4, -11);
        System.out.println("New begin point: " + ls1.getBegin().toString());
    
        System.out.println(ls1.getLength());
        System.out.println(ls1.getGradient());
    }
}
