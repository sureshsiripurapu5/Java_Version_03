class A
{
   	void    showMessage(int x, float y ) // receiving 2 argument values  
			{
              System.out.println("Java is Great");
			}
	// issue solved in Java but known as OVERLOADING
	// also receiving 2 arguments values BUT types are different 
	void    showMessage(int a , int b) 
			{
               System.out.println("C is also Great");
			}
		// return type is not CONSIDER in overloading 	
}
class PolymorphismP01OverloadingVer7
{
    public static void main(String[] args)
    {
		 A   a=new A();
	         a.showMessage(1,2.8F);
			 a.showMessage(3.6F,4);
    }
}		// SCROLL DOWN			 
						 
						 
						 
						 
						 
						 
						 
						 
						 
/*
 ERROR
 
 REASON:
 
 EXPLANATION:
 
 
 */