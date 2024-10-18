// program to prove Default constructor PROVIDED BY JAVA=> case-1
class Student
{
	int   rno;
	float fee;
	           // Student() constructor provided by Programmer
         Student(int rno,float fee)
		 {
		   this.rno=rno;
           this.fee=fee;		  
		 }	
	void  toSeeValues( ){
	      System.out.println("Roll Number  =" + rno); // fields
	      System.out.println("Fee paid(Rs.)=" + fee); // fields
	}
}
class ConstructorP02StudentClassVer9
{
	public static void main(String[] args)
    {
		Student   rGV=new Student(1,100000.0F);
		          rGV.toSeeValues();
		Student   pVR=new Student(2,40000.0f);
		          pVR.toSeeValues();
	// draback : both objects's Rollnumber is different			  
	
    }
}					 
						 