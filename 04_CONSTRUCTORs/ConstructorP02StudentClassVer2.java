// program to prove Default constructor PROVIDED BY JAVA=> case-1
class Student
{
	int   rno;
	float fee;
	
          // observe NO toStoreValues() method placed
		  // Student() constructor provided by Java 
	void  toSeeValues(){
	      System.out.println("Roll Number  =" + rno);
	      System.out.println("Fee paid(Rs.)=" + fee);
	}
	
}

class ConstructorP02StudentClassVer2
{
	public static void main(String[] args)
    {
		Student rGV=new Student();
		        // observe NOT calling method LIke toStoreValues();
				rGV.toSeeValues();
	
    }
}					 
						 