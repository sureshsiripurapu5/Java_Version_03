class Class
{
    // no fields

    void  sumTwoVals(int da , int db)                 // Formal Arg(s) Declared
             {
                 // int c; // C-style
             
                int c=da+db;  // Java-style
               System.out.println( "SUM : " + c);     
            // No return statement- Not Returning a Value
            }
}

class Prog3PassingArgsButNoRetValue
{
  public static void main( String  args[ ] ) 
  {
         // int  c;  //c-style
            Class obj = new Class();  
             int a=2 , b=3 ;
             obj .sumTwoVals(a , b);  // Passing Arguments  
                                 
   }
}




