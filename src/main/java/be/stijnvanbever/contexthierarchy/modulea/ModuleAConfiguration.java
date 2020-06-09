package be.stijnvanbever.contexthierarchy.modulea;

import be.stijnvanbever.contexthierarchy.common.ModuleController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableAutoConfiguration
@PropertySource("modulea.properties")
public class ModuleAConfiguration {
    @Bean
    public ModuleController moduleController(@Value("${module.name}") String moduleName) {
        return new ModuleController(moduleName);
    }
}
