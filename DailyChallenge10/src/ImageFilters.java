import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.Scanner;

public class ImageFilters
{
    public static void main(String[] args)
    {
        BufferedImage image = null;
        File file = null;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full image path:");
        String imagePath = sc.nextLine();
        System.out.println("type 'false' for grayscale, 'true' for inverted:");
        boolean filterType = sc.nextBoolean();
        
        try
        {
            file = new File(imagePath);
            image = ImageIO.read(file);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    
        int height = image.getHeight();
        int width = image.getWidth();
        
        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                int pixel = image.getRGB(x,y);
                
                int alpha = (pixel>>24)&0xff;
                int red = (pixel>>16)&0xff;
                int green = (pixel>>8)&0xff;
                int blue = pixel&0xff;
                
                if (!filterType)
                {
                    // sets rgb to the same average value
                    int avgValue = (red + green + blue) / 3;
                    red = green = blue = avgValue;
                } else {
                
                    // sets each color to the inverse relative to 255
                    red = 255 - red;
                    green = 255 - green;
                    blue = 255 - blue;
                }
                
                pixel = (alpha<<24) | (red<<16) | (green<<8) | blue;
                
                image.setRGB(x, y, pixel);
            }
        }
        
        try
        {
            file = new File("out.jpeg");
            ImageIO.write(image, "jpeg", file);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
