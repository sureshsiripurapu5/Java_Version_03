// program to prove Default constructor PROVIDED BY JAVA=> case-1
class Student
{
	int   rno;
	float fee;
	
          // observe NO toStoreValues() method placed
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

class ConstructorP02StudentClassVer5
{
	public static void main(String[] args)
    {
		Student rGV=new Student();
		        // observe NOT calling method LIke toStoreValues();
				rGV.Student(); // your method is NOT called 
				rGV.toSeeValues();
	
    }
}					 
						 