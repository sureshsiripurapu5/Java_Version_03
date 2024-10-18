class Emp  // not encapsulation
{
    int    id;
	double sal;
	String name;

}
class ConstructorP01EmpClassVer1
{
	
    public static void main(String[] args)
    {
	    Emp  e1=new Emp();
		     e1.id=1;
			 e1.sal=100000.0;
			 e1.name="Venkatesh";
		System.out.println(e1.id+"\n"+e1.sal+"\n"+e1.name);	
        
		Emp  e2=new Emp();
		     e2.id=2;
			 e2.sal=200000.0;
			 e2.name="Vanaja";
		System.out.println(e2.id+e2.name+e2.sal);	 
		
		     
		
		
		
    }
}					 
						 