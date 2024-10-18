class DemoMethods
{
	    void mySecondMethod()
	    { 
		  // Method calling statement : from inside
	       myFirstMethod(); // no nedd of dMethObj
        }		
		void myFirstMethod()
	    {
	      System.out.println("Executed: myFirstMethod()");
        }
}
class MethodsP01DefiningMethodVer6
{    
   public static void main(String args[])  
   {
	 DemoMethods dMethObj=new  DemoMethods();
	                   //dMethObj.myFirstMethod();
	              dMethObj.mySecondMethod();
   }	
}
	

















	
