import java.util.*;
class a
{
  public static void main(String[] args) 
  {
    Scanner s1=new Scanner(System.in);
    int n,i,j,max=0;
    System.out.println("enter the size of array");
    n=s1.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements of array");
    for(i=0;i<n;i++)
    {
      arr[i]=s1.nextInt();
    }
    for(i=0;i<n;i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];
      }
    }
    System.out.println("max value is: "+max);
  }
}