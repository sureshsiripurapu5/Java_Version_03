class Student
{
    int     rollNumber;  
	double  feePaid;
		  
	void    showData()
			{
			  System.out.println("Roll number    :" + rollNumber);
			  System.out.println("Fee Paid (Rs.) :" + feePaid);	
			}

}
class OOP03StudentVer2
{
	
    public static void main(String[] args)
    {
	    Student   bhavana=new Student();
		          bhavana.showData();  

	}
}					 
						 