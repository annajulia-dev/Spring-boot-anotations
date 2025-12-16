package aspects.specificAdvice;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {

    Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @AfterReturning(value = "@annotation(toLog)",  // value == advice annotation
                    returning = "returnedValue")  // returning == the value that method returns
    public void log(Object returnedValue){ // the variable needs to be the same name
        logger.info("Returned the value: " + returnedValue);
    }
}
