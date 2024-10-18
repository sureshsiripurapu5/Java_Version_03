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
class ConstructorP02StudentClassVer10
{
	public static void main(String[] args)
    {
		Student   rGV=new Student(,); // not passed any values:unknown
		          rGV.toSeeValues();
		Student   pVR=new Student(1,40000.0f);
		          pVR.toSeeValues();
	// draback : both objects's Rollnumber is different			  
	
    }
}					 
						 