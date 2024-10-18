// program to prove Default constructor PROVIDED BY JAVA=> case-1
class Student
{
	int   rno;
	float fee;
	           // Student() constructor provided by Programmer
        
	     Student()
		 {
		   rno=-1;
           fee=100000.0F;		  
		 }	
	void  toSeeValues(){
	      System.out.println("Roll Number  =" + rno);
	      System.out.println("Fee paid(Rs.)=" + fee);
	}
}
class ConstructorP02StudentClassVer6
{
	public static void main(String[] args)
    {
		Student rGV=new Student();
		        rGV.toSeeValues();
	
    }
}					 
						 