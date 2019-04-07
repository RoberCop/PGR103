public class MergeTwo
{
    public static void main(String[] args)
    {
        char[] A = {'f', 'h', 'x'};
        char[] B = {'c', 'f', 'z'};
        System.out.println(mergeTwo(A, B, 3));
    }
    
    private static char[] mergeTwo(char[] A, char[] B, int amount)
    {
        int inc = 0;
        char[] output = new char[amount];
        
        int i = 0;
        for (int j = 0; j < amount; j++)
        {
            if ((int) B[j] < (int) A[i])
            {
                output[inc++] = B[j];
                continue;
            }
            
            output[inc++] = A[i];
            
            if (B[j] != A[i])
            {
                j--;
                amount--;
            }
            
            i++;
        }
        
        return output;
    }
}
