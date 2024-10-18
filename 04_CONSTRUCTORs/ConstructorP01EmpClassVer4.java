class Emp  // not encapsulation
{
  // object's fields/instance varaible have default values
    int     id;  
	double  sal;
	char    gender;
	boolean married;
	String  name;
	  
	  // constructor defined & executed automatically by Java
	
	void displayData()
	{
	 System.out.println(id+"\n"+sal+"\n"+gender+"\n"+married+"\n"+name);	
	} 

}
class ConstructorP01EmpClassVer4
{
	public static void main(String[] args)
    {
			
	    Emp  emp=new Emp(); // default constructor
		     emp.displayData(); 
			 
		
	
    }
}					 
						 