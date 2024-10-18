class Class
{
    // no fields

    int  sumTwoVals(int da , int db)                 // Formal Arg(s) Declared
             {
                 int dc=da+db;  // Java-style-ERROR in C
                 return dc;    //  Returning a Value
            }
}


class Prog4PassingArgsAndAlsoRetValue
{
  public static void main( String  args[ ] ) 
  {
         
            Class obj = new Class();  
                       int a=2 , b=3 ;
             int c=obj . sumTwoVals(a , b);  // Passing Arguments  
              System.out.println( "SUM : " + c);                     
   }
}




