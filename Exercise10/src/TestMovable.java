public class TestMovable
{
    public static void main(String[] args)
    {
        Movable m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        
        Movable m2 = new MovableCircle(1, 2, 3, 4, 20);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
        
        Movable mRect = new MovableRectangle(3,5,7,6,1,4);
        System.out.println(mRect);
        mRect.moveRight();
        System.out.println(mRect);
        mRect.moveDown();
        System.out.println(mRect);
    }
}
