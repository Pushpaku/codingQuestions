
public interface InterfaceA {
	/*
	 * int i = 0; //By default, field is public, static and final
	 * 
	 * //Following statements give compile time errors
	 * 
	 * 
	 * default void display() { System.out.println("ineterface a "); } } interface
	 * InterfaceB{ default void display() { System.out.println("ineterface b "); } }
	 * class Main{ public static void main(String[] args) { InterfaceA a ; }
	 */
	
	
	    void myMethod();
	}
	 
	class B
	{
	    public void myMethod()
	    {
	        System.out.println("My Method");
	    }
	}
	 
	class C extends B implements InterfaceA
	{
		
		 public void myMethod()
		    {
		        System.out.println("My Methodss");
		    }
 
	}
	 
	class MainClass
	{
	    public static void main(String[] args) 
	    {
	    	InterfaceA a = new C();
	         
	        a.myMethod();
	    }
}
