class A
{
	void methodOne(char x) // not exact type 
	     {
		    System.out.println(x);
		 }
		
}
class MethodsWithArgsP01PassingArgumentsVer8
{
    public static void main(String[] args)
    { 
	    A obj= new A();
	       obj.methodOne(2+3*2); // method with TWO arguments as variables
	             
    }

}
 
    
