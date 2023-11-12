package fr.ubo.dosi.hello.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogInterceptorAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        try {
            System.out.println("Aspect executed before the method");
            return invocation.proceed();
        } finally {
            System.out.println("Aspect executed after the method");
        }
    }
}
