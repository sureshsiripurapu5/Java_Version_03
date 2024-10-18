class Student
{
	int   rno;
	float fee;
	
    void  toStoreValues(){  // method
		    rno=0;
		    fee=0.0F;
	// return 0;     // NOT returning any value so void
	}
	void  toSeeValues(){
		  System.out.println("Roll Number  :" + rno);
	      System.out.println("Fee paid(Rs.):" + fee);
	}
	
}
	 
	
class ConstructorP02StudentClassVer1
{
	public static void main(String[] args)
    {
		Student rGV=new Student();
		        rGV.toStoreValues();
				rGV.toSeeValues();
	
    }
}					 
						 