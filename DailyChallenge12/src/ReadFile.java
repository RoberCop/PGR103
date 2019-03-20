import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile
{
    public static void main(String[] args)
    {
        int jpegCounter = 0;
        int pngCounter = 0;
        int gifCounter = 0;
        
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter file path: ");
            String Path = sc.nextLine();
            BufferedReader reader = new BufferedReader(new FileReader(Path));
            
            String line = reader.readLine();
            
            while (line != null)
            {
                if (line.length() < 4) break;
    
                String endString4 = line.substring(line.length() - 4, line.length()).toLowerCase();
                String endString5 = "";
                
                if (line.length() != 4)
                {
                    endString5 = line.substring(line.length() - 5, line.length()).toLowerCase();
                }
                
                if (endString4.equals(".png")) pngCounter++;
                else if (endString4.equals(".gif")) gifCounter++;
                else if (endString5.equals(".jpeg")) jpegCounter++;
                
                line = reader.readLine();
            }
            
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
        System.out.println("Jpeg: " + jpegCounter + ", Png: " + pngCounter + ", Gif: " + gifCounter);
    }
}
