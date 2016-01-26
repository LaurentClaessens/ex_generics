public class MyClassB extends MyClass<MessageB>
{
    public MyClassB() { super(MessageB.class); }
    @Override
    protected Integer do_test(Message m)  // here I'm sure this is of the good type
    {
        System.out.println("This should be 35 : ");
        System.out.println(m.f(7));
        return m.f(7);
    }
}
