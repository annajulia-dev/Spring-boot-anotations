package aspects.customAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // now springs can see this annotation anytime that is needed
@Target(ElementType.METHOD) // this annotation now only can be used for methods
public @interface toLog{
}