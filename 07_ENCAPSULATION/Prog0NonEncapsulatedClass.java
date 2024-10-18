class Emp   // Not Encapsulated Class
{
    int           id;          // fields
   double     ht;
          
        //  But No method(s)
 }

class Prog0NonEncapsulatedClass
{
  public static void main(String[]  args) 
  {
            Emp  empObj=new Emp();
                     empObj.id=1;
                     empObj.ht=5.2;
            System.out.println(empObj.id+"\n"+empObj.ht);
      // SUGGESTION : Remove above statements and USE atleast ONE method to encapsulate
     }
}




