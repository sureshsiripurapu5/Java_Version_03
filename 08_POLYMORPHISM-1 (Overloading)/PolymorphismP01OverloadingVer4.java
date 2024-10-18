class A
{
   	void    showMessage(int x ) // receiving 1 argument value  
			{
              System.out.println("Java is Great");
			}
	// issue solved in Java but known as OVERLOADING
	void    showMessage(int a , int b) // receiving 2 arguments values 
			{
               System.out.println("C is also Good");
			}
		// return type is not CONSIDER in overloading 	
}
class PolymorphismP01OverloadingVer4
{
    public static void main(String[] args)
    {
		 A   a=new A();
	         a.showMessage(1);
			 a.showMessage(1,2);
    }
}					 
						 