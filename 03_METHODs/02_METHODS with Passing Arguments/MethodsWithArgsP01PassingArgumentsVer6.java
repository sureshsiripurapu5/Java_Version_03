class A
{
	void methodOne(double y,int x)
	     {
		    System.out.println(x+"\n"+y);
		 }
		
}
class MethodsWithArgsP01PassingArgumentsVer6
{
    public static void main(String[] args)
    { 
	  int x=9;double y=2.5;
         A obj= new A();
	       obj.methodOne(x,y); // method with TWO arguments
	             
    }

}
 
    
