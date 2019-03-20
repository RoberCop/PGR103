import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringReplace
{
    public static void main(String[] args)
    {
        System.out.println(replaceWith("This is a test", "is", "is not"));
        System.out.println(replaceWith("Hello World", "Hello", "Goodbye"));
        System.out.println(replaceWith("This: This, This/ still works", "This", "wow"));
    }
    
    private static String replaceWith(String text, String replace, String newStr)
    {
        StringBuilder textBuild = new StringBuilder();
        
        Pattern patt = Pattern.compile("\\w+");
        Matcher match = patt.matcher(text);
        int lastEnd = 0;
        
        while(match.find())
        {
            if (text.substring(match.start(), match.end()).equals(replace))
            {
                textBuild.append(text.substring(lastEnd, match.start()));
                textBuild.append(newStr);
                lastEnd = match.end();
            }
        }
        
        textBuild.append(text.substring(lastEnd));
        
        return textBuild.toString();
    }
}
