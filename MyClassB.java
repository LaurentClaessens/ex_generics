public class MyClassB extends MyClass<MessageB>
{
    public MyClassB() { super(MessageB.class); }
    @Override
    protected Integer do_test(Message m) 
    {
        return m.f(7);
    }
}
