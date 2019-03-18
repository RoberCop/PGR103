public class PigRecursion
{
    public static void main(String[] args)
    {
        int pigNum = 10;
        System.out.println(pigNum + " pigs has: " + pigEars(pigNum) + " ears in total");
    }
    
    private static int pigEars(int n)
    {
        return (n > 0) ? 2 + pigEars(n - 1) : 0;
    }
}
