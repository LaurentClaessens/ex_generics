public class MyClassA extends MyClass<MessageA>
{
    public Integer test(Message m)
    {
        if (m instanceof MessageA)
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
