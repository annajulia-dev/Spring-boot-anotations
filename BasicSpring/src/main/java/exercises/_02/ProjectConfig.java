package exercises._02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"exercises._02", "exercises._02.proxies", "exercises._02.repositories", "exercises._02.services"})
public class ProjectConfig {
}
