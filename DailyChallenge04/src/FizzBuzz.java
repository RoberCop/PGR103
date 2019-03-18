public class FizzBuzz
{
    public static void main(String[] args)
    {
        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));
        System.out.println(fizzString("fib"));
    }
    
    private static String fizzString(String inputStr)
    {
        return (inputStr.startsWith("f")) ?
                 (inputStr.endsWith("b")) ? "FizzBuzz" : "Fizz"
               : (inputStr.endsWith("b")) ? "Buzz" : inputStr;
    }
}
