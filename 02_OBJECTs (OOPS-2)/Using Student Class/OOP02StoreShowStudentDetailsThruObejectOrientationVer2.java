class Student
{
	
	           // FIELDs or INSTANCE VARIABLEs 
	int     rollNumber;  
	double  feePaid;
	      
		      // METHODs or INSTANCE METHODs
	void    inputData(double f,int r)
			{
				feePaid=f;
			   rollNumber=r;
            }
	void    outputData()
			{
			  System.out.println(rollNumber+" \n"+feePaid);	
			}

}


class OOP02StoreShowStudentDetailsThruObejectOrientationVer2
{
    public static void main(String[] args)
    {
	    Student   PVR =new Student();
		          PVR.inputData(10000.0,1);
                  PVR.outputData();
				  
		Student   xyz =new Student();
		          xyz.inputData(1500.75,2);
                  xyz.outputData();
				  		  
		
		
		
		// perfectly TRUE w.r.t TWO objects as  students		  
	  
	  
	}
}					 
						 