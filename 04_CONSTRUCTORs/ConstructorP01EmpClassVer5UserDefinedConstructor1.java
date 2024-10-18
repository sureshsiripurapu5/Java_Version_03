class Emp  // not encapsulated
{
  // object's fields/instance varaible have default values
    int     id;  
	double  sal;
	char    gender;
	boolean married;
	String  name;   // not primitive type it is class type
	        Emp()
            {
              id=1;
              sal=1.1;
              gender='t';
              married=true;
              name="xyz";			  
     System.out.println(id+"\n"+sal+"\n"+gender+"\n"+married+"\n"+name);	
	        } 
}
class ConstructorP01EmpClassVer5UserDefinedConstructor1
{
	public static void main(String[] args)
    {
		Emp  emp=new Emp(); // default constructor
		    
		
	
    }
}					 
						 