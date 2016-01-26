import java.lang.*;
public class ex_generics
{

  public static void main(String args[]) 
  {
      MyClassA a  = new MyClassA();
      MyClassB b  = new MyClassB();

      MessageA ma=new MessageA();
      MessageB mb=new MessageB();
      System.out.println(  a.test(ma)  ); //14
      System.out.println( a.test(mb) );  // Bad type
      System.out.println(  b.test(ma)  ); // Bad type
      System.out.println(  b.test(mb)  ); // 35
  }
}
