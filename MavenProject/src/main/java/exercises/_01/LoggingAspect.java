package exercises._01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(logMe)")
    public Object logBeforeAttack(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        logger.info("Knight is going to attack!");

        Object result = joinPoint.proceed();

        long end = System.currentTimeMillis();

        logger.info("Attack took: "+ (end - start) + "ms");

        return result;
    }

}
