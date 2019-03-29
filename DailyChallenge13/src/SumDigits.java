import java.util.*;

public class SumDigits
{
    public static void main(String[] args)
    {
        String myText = "Det var en gang en liten geitekilling som hadde lært å telle til 3. " +
                "Da han kom til en vannpytt, stod han lenge og så på speilbildet sitt i " +
                "vannet, og nå skal du høre hvordan det gikk: 1, sa geitekillingen. " +
                "Dette hørte en kalv som gikk i nærheten og åt gras. – Hva gjør du for noe? sa kalven. " +
                "Jeg teller meg, sa geitekillingen. – Skal jeg telle deg også? Hvis det ikke gjør vondt, " +
                "så, sa kalven. Det gjør det vel ikke, stå stille, så skal jeg telle deg også? " +
                "Nei, jeg tør ikke, kanskje jeg ikke får lov av mora mi engang, sa kalven og " +
                "trakk seg unna. Men geitekillingen fulgte etter, og så sa han: Jeg er 1, og du er 2, 1-2. " +
                "Mo-er! rautet kalven og begynte å gråte, og så kom mora til kalven, og det var selveste bjellekua " +
                "på garden. Hva er det du rauter for? sa bjellekua. Geitekillingen teller meg! rautet kalven. " +
                "Hva er det for noe? sa bjellekua. Jeg teller, sa geitekillingen. Jeg har lært å telle til 3, " +
                "jeg gjør bare sånn: Jeg er 1, kalven 2, kua 3, 1-2-3. Å, nå telte han deg også! rautet kalven. " +
                "Og da bjellekua skjønte det, ble den sint. Jeg skal lære deg å gjøre narr av kalven min og meg! " +
                "Kom, kalven min, så tar vin’n.";
        
        printDigitSum("2b3,f4435,64,364,434jn4k3bh543");
        printDigitSum(myText);
    }
    
    private static void printDigitSum(String inputStr)
    {
        StringBuilder digitStrBuild = new StringBuilder();
        int digitSum = 0;
        
        for (char character : inputStr.toCharArray())
        {
            if (Character.isDigit(character))
            {
                final String digitStr = String.valueOf(character);
                digitStrBuild.append(digitStr);
                digitSum += Integer.parseInt(digitStr);
            }
        }
    
        System.out.println("Digits:");
        System.out.println(digitStrBuild);
        System.out.println("Digit Sum:");
        System.out.println(digitSum);
    }
}
