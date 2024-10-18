class Student
{
	
	           // FIELDs or INSTANCE VARIABLEs 
	int     rollNumber;  
	double  feePaid;
	      
		      // METHODs or INSTANCE METHODs
	void    inputData()
			{
			   rollNumber=1;
               feePaid=10000;			  
				
			}
	void    outputData()
			{
			  System.out.println(rollNumber+" \n"+feePaid);	
			}

}


class OOP02StoreShowStudentDetailsThruObejectOrientation
{
    public static void main(String[] args)
    {
	    Student   PVR =new Student();
		          PVR.inputData();
                  PVR.outputData();
		// perfectly TRUE w.r.t single object PVR studenr		  
	  
	  
	}
}					 
						 