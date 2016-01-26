import java.lang.*;
abstract public class MyClass<T extends Message>
{
    protected Class<T> type;
    public MyClass (Class<T> type) { this.type=type; }
    protected Integer do_test(Message m) { System.out.println("This method should be overridden."); return 0;  }
    public Integer test(Message m)
    {
        if (type.isInstance(m)) { return  do_test(m); }
        else 
        { 
            System.out.println("Bad type");
            return 0;
        }
    }
}
