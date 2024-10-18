class Emp   // Now becomes Better Encapsulated Class
{
    int        id;                              // fields
   double  ht;
                                                  //  +

   void    storeData()        // a method ONE  
              {
                 id=1;                            // store data statements
                 ht=5.2;
               }
 void    showData()        // a method TWO
              {
                System.out.println(id);  // show data statements
                System.out.println(ht);
              }
}

class Prog1EncapsulatedClassVer2
{
  public static void main(String[]  args) 
  {
            Emp  empObj=new Emp();
                     empObj.storeData();
                     empObj.showData();
          
   }
}




