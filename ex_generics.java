import java.lang.*;
public class ex_generics
{

  public static void main(String args[]) 
  {
      System.out.println("hello");
      //Class<MessageA> type=MessageA.class;
      MyClassA a  = new MyClassA();

      MessageA ma=new MessageA();
      MessageB mb=new MessageB();
      a.test(ma);
      a.test(mb);
  }
}
