package fr.ubo.dosi.hello.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Avant l'exécution de la méthode: " + invocation.getMethod().getName());

        Object result = invocation.proceed();

        System.out.println("Après l'exécution de la méthode: " + invocation.getMethod().getName());

        return result;
    }
}