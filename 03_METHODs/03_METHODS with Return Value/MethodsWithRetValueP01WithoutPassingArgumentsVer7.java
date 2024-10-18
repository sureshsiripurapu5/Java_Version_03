class A
{
    double methodOne()  
	    {
		  return 9;
		}
		
}
class MethodsWithRetValueP01WithoutPassingArgumentsVer7
{
    public static void main(String[] args)
    { 
  	   A obj= new A();
	   double r=obj.methodOne(); // method with No argument but Receiving a value ????
	   System.out.println(r);          
    }

}
 
    
