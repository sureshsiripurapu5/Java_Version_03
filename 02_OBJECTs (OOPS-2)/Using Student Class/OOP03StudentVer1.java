class Student
{
    int     rollNumber;  
	double  feePaid;
		  
	void    setData()  // useless method
			{
     			rollNumber=0 ;  
			    feePaid=0.0;
			}
	void    showData()
			{
			  System.out.println("Roll number    :" + rollNumber);
			  System.out.println("Fee Paid (Rs.) :" + feePaid);	
			}

}
class OOP03StudentVer1
{
	
    public static void main(String[] args)
    {
	    Student   bhavana=new Student();
		          bhavana.setData();
		          bhavana.showData();  
    }
}					 
						 