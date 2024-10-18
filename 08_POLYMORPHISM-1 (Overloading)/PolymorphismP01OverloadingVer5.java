class A
{
   	void    showMessage(int x, int y ) // receiving 2 argument value  
			{
              System.out.println("Java is Great");
			}
	// issue solved in Java but known as OVERLOADING
	void    showMessage(int a , int b) // also receiving 2 arguments values 
			{
               System.out.println("C is also Good");
			}
		// return type is not CONSIDER in overloading 	
}
class PolymorphismP01OverloadingVer5
{
    public static void main(String[] args)
    {
		 A   a=new A();
	         a.showMessage(8);
			 a.showMessage(6,3);
    }
}					 
						 