package pack;
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
					/*if(a[i]>a[i+1])
					{
						int temp=a[i];
						a[i]=a[i+1];
						a[i+1]=temp;
						
					}*/
					
				}
				System.out.println("sorted display elements ");
				for(int i=0;i<n;i++)
				{
					System.out.println(+a[i]);
				}
				
			
			
				System.out.println("Enter the number you want to search ");
				int no=sc.nextInt();
				int x=a[0];
				int y=a.length; 
				int m=(x+y)/2;
				
				while(x<=y)
				{
					if(no==a[m])
					{
						System.out.println("The number is at " +m+ " index position ");
						break;
					}
					else if(no>a[m])
					{
						x=m+1;
						//System.out.println("The number is at "+m+ " index position ");
					}
					else 
					{
						y=m-1;
						//System.out.println("The number is at "+m+ " index position ");
					}
					m=(x+y)/2;
					
				}
				if(m==y)
				{
					System.out.println("Number is not present in the array ");
				}
			

		}
		 
			
		
			 public static void main(String args[])
			 {
				BinarySearch B =new BinarySearch();
				B.binarysearch();
			 }
			





	}


