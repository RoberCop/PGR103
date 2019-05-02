public class SingleExceptions
{
    public static void main(String[] args)
    {
        try {
            int x = 5/0;
        } catch (ArithmeticException e) {
            System.out.println(e);
            // int y = 5/0; error
        }
    }
}
