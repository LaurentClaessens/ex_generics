public class MyClassA extends MyClass<MessageA>
{
    public MyClassA() { super(MessageA.class); }
    @Override
    protected Integer do_test(Message m) 
    {
        return m.f(7);
    }
}
