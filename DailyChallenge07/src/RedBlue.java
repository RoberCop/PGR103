public class RedBlue
{
    public static void main(String[] args)
    {
        System.out.println(findRedBlue("redxx"));
        System.out.println(findRedBlue("xxred"));
        System.out.println(findRedBlue("blueTimes"));
    }
    
    private static String findRedBlue(String input)
    {
        if (input.substring(0, 3).equals("red")) return "red";
        else if (input.substring(0, 4).equals("blue")) return "blue";
        else return "";
    }
}
