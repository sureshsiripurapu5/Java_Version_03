class Class
{
    // no fields

    int  sumTwoVals()                 //No Formal Arg(s) Declared
             {
               int a=2,b=3,dc;
                 dc=a+b;
              return dc;                         //But Returning a Value
            }
}

class Prog2NoArgButRetValue
{
  public static void main( String  args[ ] ) 
  {
         // int  c;  //c-style
            Class obj = new Class();  
             int   c=obj .sumTwoVals();  // No Argument Passed
             System.out.println( "SUM : " + c);                      
   }
}




