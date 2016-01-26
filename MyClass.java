import java.lang.*;
abstract public class MyClass<T extends Message>
{
    public Integer test(Message m)
    {
        if ( T.class.isInstance(m)  )
        {
            return m.f(7);
        }
        else
        {
            System.out.println("Bad type.");
            return 0;
        }
    }
}
