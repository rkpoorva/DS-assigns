import java.util.*;
class b
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
      for(j=0;j<n-i-1;j++)
      {
        if(arr[j]>arr[j+1])
        {
          arr[j]=arr[j]^arr[j+1];
          arr[j+1]=arr[j]^arr[j+1];
          arr[j]=arr[j]^arr[j+1];
        }
      }
    }
System.out.println("Sorted array:");
    for(i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
    
  }
}