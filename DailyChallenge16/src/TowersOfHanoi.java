public class TowersOfHanoi
{
    public static void main(String[] args)
    {
        solve(4, 'A', 'B', 'C');
    }
    
    private static void solve(int diskNum, char start, char aux, char end)
    {
        if (diskNum == 1)
        {
            System.out.println(start + "->" + end);
        }
        else
        {
            solve(diskNum - 1, start, end, aux);
            System.out.println(start + "->" + end);
            solve(diskNum - 1, aux, start, end);
        }
    }
}
