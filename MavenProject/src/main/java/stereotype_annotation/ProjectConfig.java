package stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "stereotype_annotation") // location to find classes to put in context
public class ProjectConfig {
}
