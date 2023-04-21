package toy.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import toy.config.EnableMyAutoconfiguration;
import toy.config.autoconfig.DispatcherServletConfig;
import toy.config.autoconfig.TomcatWebServerConfig;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@ComponentScan
@EnableMyAutoconfiguration
public @interface MySpringBootApplication {

}
