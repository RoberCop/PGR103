public class Summerize
{
    public static void main(String[] args)
    {
        System.out.println(jinxedSum(1, 2, 3));
        System.out.println(jinxedSum(1, 2, 4));
        System.out.println(jinxedSum(1, 4, 3));
        System.out.println(jinxedSum(4, 2));
        System.out.println(jinxedSum(2, 5, 1, 9, 3, 2, 4));
    }
    
    private static int jinxedSum(int... input)
    {
        int sum = 0;
        
        for (int currentNum : input)
        {
            if (currentNum == 4) break;
            sum += currentNum;
        }
        
        return sum;
    }
}
