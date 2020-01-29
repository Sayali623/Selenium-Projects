package packag;


	
	
import java.util.Scanner;

public class BinarySearch {

	void binarysearch()
	{
	System.out.print("Enter the index range to be stored in  array ");
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements in array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("display elements ");
		for(int i=0;i<n;i++)
		{
			System.out.println(+a[i]);
		}
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
			
		}
		System.out.println("sorted display elements ");
		for(int i=0;i<n;i++)
		{
			System.out.println(+a[i]);
		}
		
		System.out.println("Enter the number you want to search ");
		int number=sc.nextInt();
		int x=0;
		int y =a.length-1;
		int m = (x+y)/2;
		 while( x <= y ){  
			       if ( a[m] < number ){  
			        x = m + 1;     
			       }else if ( a[m] == number ){  
			         System.out.println("number found at index position" + m);  
			         break;  
			       }else{  
			          y = m - 1;  
			      }  
			    }  
			    if ( x > y ){  
			       System.out.println("number is not present in array");  
			    }  
}

	 public static void main(String args[])
	 {
		BinarySearch obj =new BinarySearch();
		obj.binarysearch();
	 }
}











