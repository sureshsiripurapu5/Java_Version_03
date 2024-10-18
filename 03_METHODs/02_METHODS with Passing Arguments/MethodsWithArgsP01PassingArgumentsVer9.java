class A
{
	void methodOne(int x)  // exact type
	     {
		    System.out.println(x);
		 }
		
}
class MethodsWithArgsP01PassingArgumentsVer9
{
    public static void main(String[] args)
    { 
  	   A obj= new A();
	     obj.methodOne(2+3*2); // method with arguments as expression
	             
    }

}
 
    
