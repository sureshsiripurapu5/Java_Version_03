class Student
{
    int     rollNumber;  
	double  feePaid;
		  
	void    setData(int r,double f)
			{
     			rollNumber=r ;  
			    feePaid=f;
			}
	void    showData()
			{
			 
			  System.out.println("Roll number    :" + rollNumber);
			  System.out.println("Fee Paid (Rs.) :" + feePaid);	
			}

}
class OOP03StudentVer3
{
	
    public static void main(String[] args)
    {
	    Student   bhavana=new Student      ();
		            // observe NOT calling setData() method
		          bhavana.showData();  
            	
	}
}					 
						 