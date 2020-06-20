package chapter15;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

class MixinProxy implements InvocationHandler {
    Map<String, Object> delegatesByMethod;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
public class DyncmicProxyMixin {
}
