package aspects.order;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
@Order(1)
public class SecurityAspect {

    Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    @Around("@annotation(toLog)")
    public void securityTest(ProceedingJoinPoint joinPoint) throws Throwable {

        logger.info("Executing test securitys");

        if (true){
            joinPoint.proceed();
        }

    }

}
