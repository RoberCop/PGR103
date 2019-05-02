import javax.swing.*;

public class MultipleExceptions
{
    public static void main(String[] args)
    {
        try
        {
            String value = JOptionPane.showInputDialog(null, "Enter value:");
        
            int divisor = Integer.parseInt(value);
        
            System.out.println(3 / divisor);
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("Exception caught by this program: Enter numeric value.");
        }
        catch (ArithmeticException exc)
        {
            System.out.println("Exception caught by this program: Divisor was 0.");
        }
    
        System.out.println("After exception.");
    }
}
