import java.util.Scanner;
public class ss
{
   public static void SubString(String str, int n)
    {
       for (int i = 0; i < n; i++) 
           for (int j = i+1; j <= n; j++)
                System.out.println(str.substring(i, j));
    }
 
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        String str = s1.nextLine();
        SubString(str, str.length());
    }
}