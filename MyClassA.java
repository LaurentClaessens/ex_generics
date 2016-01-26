public class MyClassA extends MyClass<MessageA>
{
    public MyClassA() { super(MessageA.class); }
    @Override
    protected Integer do_test(Message m) 
    {
        System.out.println("This should be 14 : ");
        System.out.println(m.f(7));
        return m.f(7);
    }
}
