class A
{
    int methodOne()  
	    {
		   // return 9,4;  // ERROR
		   
		   /* 
		   return 9;
		   return 4;   // ERROR
		   */ 
		   int r=9;
		  
		return r;
		}
		
}
class MethodsWithRetValueP01WithoutPassingArgumentsVer6
{
    public static void main(String[] args)
    { 
  	   A obj= new A();
	   int r=obj.methodOne(); // method with No argument but Receiving a value ????
	   System.out.println(r);          
    }

}
 
    
