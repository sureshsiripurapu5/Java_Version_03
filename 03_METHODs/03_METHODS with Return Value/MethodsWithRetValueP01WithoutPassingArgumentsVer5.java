class A
{
    int methodOne()  
	    {
		   return 9;
		}
		
}
class MethodsWithRetValueP01WithoutPassingArgumentsVer5
{
    public static void main(String[] args)
    { 
  	   A obj= new A();
	   int r;
	   r=obj.methodOne(); // method with No argument but Receiving a value ????
	   System.out.println(r);          
    }

}
 
    
