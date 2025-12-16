package aspects.customAnnotation;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class LogAspect {
    private Logger logger = Logger.getLogger(LogAspect.class.getName());

    @Around("@annotation(toLog)")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("You will:" + joinPoint.getClass().getName() + " the comment: " + joinPoint.getArgs());
        joinPoint.proceed();
        logger.info("The operation has been done");
    }
}
