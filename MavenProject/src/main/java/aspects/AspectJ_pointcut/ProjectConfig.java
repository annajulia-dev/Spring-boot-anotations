package aspects.AspectJ_pointcut;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "aspects.AspectJ_pointcut")
@EnableAspectJAutoProxy
public class ProjectConfig {
}
