class A
{
   	void    showMessage( )    // ZERO argument 
			{
              System.out.println("Java is Great");
			}
		//issue can be solved in Java but STILL ERROR HERE	
	int     showMessage( )    // Here ALSO ZERO argument 
			{
               System.out.println("C is also Good");
			   return 0; 
			}
		// return type is not CONSIDER in overloading 	
}
class PolymorphismP01OverloadingVer3
{
    public static void main(String[] args)
    {
		 A   a=new A();
	         a.showMessage();
    }
}					 
						 