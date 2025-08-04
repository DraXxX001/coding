import java.util.*;
public class Equil
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter an array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d,",arr[i]);
        }
        int sum=0;
        int suml[]=new int[n];
        int sumr[]=new int[n];
        for(int i=1;i<n;i++)
        {
            sum=sum+arr[i-1];
            suml[i]=sum;
        }
         System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d,",suml[i]);
        }
        sum=0;
        for(int i=n-2;i>0;i--)
        {
            sum=sum+arr[i+1];
            sumr[i]=sum;
        }
         System.out.println();
        for(int i=1;i<n;i++)
        {
            System.out.printf("%d,",sumr[i]);
        }
        for(int i=1;i<n-1;i++)
        {
            if(suml[i]==sumr[i])
            {
                System.out.printf("\nEquilibrium position is : %d",i);
            }
        }
    }
}