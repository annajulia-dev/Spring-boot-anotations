package aspects.order;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
@Order(2)
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(toLog)")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {

        logger.info("Before method initiated");

        joinPoint.proceed();

        logger.info("After method executed");
    }
}
