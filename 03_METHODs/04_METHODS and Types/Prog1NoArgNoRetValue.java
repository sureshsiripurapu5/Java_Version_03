class Class
{
    // no fields

     void sumTwoVals()                 //No Formal Arg(s) Declared
     {
         int a=2,b=3,c;
              c=a+b;
         System.out.println( "SUM : " + c); 
        // no return statement-No Return Value
     }
}

class Prog1NoArgNoRetValue
{
  public static void main( String  args[ ] ) 
  {
            Class obj = new Class();  
                     obj .sumTwoVals(); // No Argument Passed
                                   
   }
}




