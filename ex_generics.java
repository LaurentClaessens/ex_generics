import java.lang.*;
public class ex_generics
{

  public static void main(String args[]) 
  {
      System.out.println("hello");
      MyClassA a  = new MyClass<MessageA>();

      MessageA ma=new MessageA();
      MessageB mb=new MessageB();
      a.test(ma);
      a.test(mb);
  }
}
