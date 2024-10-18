class A
{
   	void    showMessage( )   
			{
              System.out.println("Java is Great");
			}
	void    displayMessage() //issue can be solved by changing method names
			{
               System.out.println("C++ is also Good");	
			}
}
class PolymorphismP01OverloadingVer1
{
    public static void main(String[] args)
    {
		 A   a=new A();
	         a.showMessage();
    }
}					 
						 