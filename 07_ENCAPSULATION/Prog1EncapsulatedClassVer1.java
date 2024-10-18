class Emp   // Now becomes Good Encapsulated Class
{
    int        id;                              // fields
   double  ht;
                                                  //  +

   void    storeAndShow()        // a method (minimum ONE )
              {
                 id=1;                            // store data statements
                 ht=5.2;
                System.out.println(id);  // show data statements
                System.out.println(ht);
              }
}

class Prog1EncapsulatedClass
{
  public static void main(String[]  args) 
  {
            Emp  empObj=new Emp();
                     empObj.storeAndShow();
          
   }
}




