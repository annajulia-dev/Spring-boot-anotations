package aspects.AspectJ_pointcut;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;


@Component
@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* aspects.AspectJ_pointcut.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        String methodName = joinPoint.getSignature().getName();

        Object [] arguments = joinPoint.getArgs();

        logger.info("Method: " + methodName +
                " with parameters: " + Arrays.asList(arguments) +
                " will execute");
        Object [] newArguments = {new Comment()};

        Object returned = joinPoint.proceed(newArguments); //  substitute the original argument

        logger.info("Method returned: "+ returned);
        return returned;
    }
}
