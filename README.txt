This is a small exercise program[1]. The purpose is to implement something like

class MyClass<T extends Base>
{
    void test(Base b)
    {
        if (b isinstance T)   { do_something();   }
        else { do_something_else();   }
    }
}

As it, it does not work because of the type erasure : the type 'T' is not available at runtime.


The trick is to take track of the type parameter in a protected variable 'type'.
The constructor of MyClass<T ...> cannot do it itself, one again because of type erasure (this.type=T does not work).
This is the constructor of the derived class that furnish the correct class parameter to the constructor.


[1]  If you need a licence, take this one :  http://fr.wikipedia.org/wiki/WTFPL
