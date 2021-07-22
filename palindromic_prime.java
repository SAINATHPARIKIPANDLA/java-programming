
import java.util.*;
public class TestCase 
{
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

	public static void main(String[] arr) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int k=0;k<n;k++)
	    {
	   int l=sc.nextInt();
	   int r=sc.nextInt();
	   int rem,sum=0;
	   int count =0;
	   for(int i=l;i<=r;i++)
	   {
	      if(isPrime(i))
	      {
	          int temp=i;
	       while(i<0)
	       {
	           rem=i%10;
	           sum=(sum*10)+rem;
	           i=i/10;
	       }
	       if(temp==i)
	       {
	           count++;
	       }
	      }
	   }
	   System.out.println(count);
	    }
	   
	}
}
//
input 

1 9
output
4

