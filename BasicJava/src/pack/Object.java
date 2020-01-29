package pack;

public class Object {
	  public static String myClassVar="class or static variable";
	  public static void main (String args[])
	  {
		  Object o = new Object();
		  Object o1=new Object();
		  Object o2= new Object();
		  
	      System.out.println(o.myClassVar);
	      System.out.println(o1.myClassVar);
	      System.out.println(o2.myClassVar);
	      	
	      o1.myClassVar="changed";


		  
	  }

}
