class A
{
	void methodOne(float x)  // NOT exact type, is it ERROR?
	     {
		    System.out.println(x);
		 }
		
}
class MethodsWithArgsP01PassingArgumentsVer10
{
    public static void main(String[] args)
    { 
  	   A obj= new A();
	     obj.methodOne(9); // method with arguments as Literal
	             
    }

}
 
    
