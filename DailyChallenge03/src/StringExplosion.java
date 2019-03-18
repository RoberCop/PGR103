public class StringExplosion
{
    public static void main(String[] args)
    {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }
    
    private static String stringSplosion(String fullStr)
    {
        StringBuilder output = new StringBuilder();
        
        for (int i = 1; i <= fullStr.length(); i++)
        {
            output.append(fullStr.substring(0, i));
        }
        
        return output.toString();
    }
}
