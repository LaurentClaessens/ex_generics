import java.lang.*;
public class MessageA implements Message
{
    public Integer f(Integer x)
    {
        System.out.println("A.f");
        return 2*x;
    }
}
