package sk.itsovy.kutka.aopdemo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sk.itsovy.kutka.aopdemo.Account;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {


//    @Before("execution(public void add*())")

    @Before("sk.itsovy.kutka.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint) {
        System.out.println("ASPECT @BEFORE");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature);

        Object[] args = joinPoint.getArgs();
        for (Object tempArgs : args) {
            System.out.println(tempArgs);

            if (tempArgs instanceof Account) {
                Account account = (Account) tempArgs;
                System.out.println("account name: " + account.getName());
            }
        }
    }


}
