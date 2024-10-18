class Student
{
	
	           // FIELDs or INSTANCE VARIABLEs 
	int     rollNumber;  
	double  feePaid;
	      
		      // METHODs or INSTANCE METHODs
	void    inputData(int rollNumber,double feePaid)
			{
				   // LHS fieldName and RHS argVariable are same names
				this.rollNumber=rollNumber ; // here this is mandatory
				this.feePaid=feePaid ;
			    
            }
	void    outputData()
			{
			  System.out.println(this.rollNumber+" \n"+this.feePaid);	
			             // here this is optional
			}

}


class OOP02StoreShowStudentDetailsThruObejectOrientationVer5Solution2
{
    public static void main(String[] args)
    {
	    Student   PVR =new Student();
		          PVR.inputData(1,123.45);
                  PVR.outputData();
				  
		Student   xyz =new Student();
		          xyz.inputData(2,678.91);
                  xyz.outputData();
				  		  
		
		
		
		// perfectly TRUE w.r.t TWO objects as  students		  
	  
	  
	}
}					 
						 