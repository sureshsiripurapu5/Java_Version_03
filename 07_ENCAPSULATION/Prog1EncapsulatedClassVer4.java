 // fields+constructor+method
class Emp   // Much Improved Encapsulated Class - The Great Design
{
    int        id;                          
   double  ht;

                Emp()     // a constructor for default values 
                {
                    id=1;                              // store operations
                    ht=5.2;
                }
     void  showData()
              {           
                System.out.println(id);    // show operations
                System.out.println(ht);
              }
}

class Prog1EncapsulatedClassVer3
{
  public static void main(String[]  args) 
  {
            Emp empObj=new Emp();  // default constructor call
                    empObj.showData();  // method call     
        
   }
}




