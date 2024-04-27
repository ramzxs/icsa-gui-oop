package class_method;

public abstract class MyClass extends SuperClass implements SomeInterface {
    double anAttribute;

    public final static synchronized int someMethod(char a, String s) throws SomeException {
        return 0;
    }

    @Override
    byte abstractMethod() {
        return 0;
    }

    private native void someNativeMethod();
}