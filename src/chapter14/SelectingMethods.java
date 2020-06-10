package chapter14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class MethodSelector implements InvocationHandler {
    private Object proxied;
    public MethodSelector(Object proxied) {
        this.proxied = proxied;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("interesting")) {
            System.out.println("Proxy detected the interesting method");
        }
        return method.invoke(proxied, args);
    }
}
interface Somethods {
    void boring1();
    void boring2();
    void interesting(String arg);
    void boring3();
}
class Implementation implements Somethods {

    @Override
    public void boring1() {
        System.out.println("boring1");
    }

    @Override
    public void boring2() {
        System.out.println("boring2");
    }

    @Override
    public void interesting(String arg) {
        System.out.println("interesting:" + arg);
    }

    @Override
    public void boring3() {
        System.out.println("boring3");
    }
}
class SelectingMethods {
    public static void main(String[] args) {
        Somethods proxy = (Somethods) Proxy.newProxyInstance(Somethods.class.getClassLoader(), new Class[]{Somethods.class}, new MethodSelector(new Implementation()));
        proxy.boring1();
        proxy.boring2();
        proxy.boring3();
        proxy.interesting("bonobo");
    }
}
