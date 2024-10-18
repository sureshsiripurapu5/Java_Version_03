class Emp  // not encapsulation
{
  // object's fields/instance varaible have default values
    int    id;  
	double sal;
	String name;
	
	void keepData(int i,double s,String n)
	{
		id=i;
		sal=s;
		name=n;
	}	
	void displayData()
	{
	 System.out.println(id+"\n"+sal+"\n"+name);	
	} 

}
class ConstructorP01EmpClassVer3
{
	public static void main(String[] args)
    {
		//int a;
		//System.out.println(a); // ERROR
		
	    Emp  e1=new Emp();
		     //e1.keepData(1,300000.0,"Harsha");
		     e1.displayData(); 
			 
		Emp  e2=new Emp();
		     //e2.keepData(2,500000.0,"Ganesh");
		     e2.displayData();
	
    }
}					 
						 