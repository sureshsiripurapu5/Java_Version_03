class Emp
{
   int      id;  // field hidden in this CASE               
                   void storeData(int id)  // id receives 2 no doubt
                            {
                              id=id;  // but field is HIDDEN in this CASE
                           // becomes local variable(id)=(local variable(id);
                         } 
   // default constructor executes FIRST and stores ZERO for field id
                     void showData()
                            {
                              System.out.println( id );
                            }
}

class Prog1WithFieldsAndArgsAsExactNamesVer1
{
  public static void main( String  args[ ] ) 
  {
            Emp empObj = new Emp(); //default constructor call
                     empObj.storeData(2); // 2 is passed
                     empObj.showData(); // output ZERO but not 2
                                   
   }
}




