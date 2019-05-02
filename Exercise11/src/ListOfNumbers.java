import java.io.*;
import java.util.Vector;

public class ListOfNumbers
{
    private Vector v;
    private static final int SIZE = 10;
    
    public ListOfNumbers()
    {
        v = new Vector(SIZE);
        for (int i = 0; i < SIZE; i++)
            v.addElement(new Integer(i));
    }
    
    public void writeList()
    {
        PrintWriter out = null;
        try
        {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("out/OutFileExercise11.txt"));
            
            for (int i = 0; i < (SIZE + 1) ; i++)
                System.out.println("Value at: " + i + " = " + v.elementAt(i));
        }
        catch (ArrayIndexOutOfBoundsException aie)
        {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + aie.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("Caught IOException: " + e.getMessage());
        }
        finally
        {
            if (out != null)
            {
                out.close();
                System.out.println("PrintWriter closed.");
            } else System.out.println("No PrintWriter object.");
        }
    }
}
