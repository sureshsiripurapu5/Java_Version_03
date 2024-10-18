class Emp
{
   int      id;  // field hidden in this CASE               
   
   void storeData(int id)  // id receives 2 no doubt
            {
               this.id=id; // now 2 stored in current object's id field   
                           // this(keyword) is  Java's pre-defined reference variable for current object
             } 
   // default constructor executes FIRST and stores ZERO for field id
                     void showData()
                            {
                              System.out.println( id );
                            }
}

class Prog1WithFieldsAndArgsAsExactNamesVer2
{
  public static void main( String  args[ ] ) 
  {
            Emp empObj = new Emp(); //default constructor call
                     empObj.storeData(2); // 2 is passed
                     empObj.showData(); // output ZERO but not 2
                                   
   }
}




