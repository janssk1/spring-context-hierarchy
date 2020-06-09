package be.stijnvanbever.contexthierarchy.moduleb;

import be.stijnvanbever.contexthierarchy.common.ModuleController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableAutoConfiguration
@PropertySource("moduleb.properties")
public class ModuleBConfiguration {
    @Bean
    public ModuleController moduleController(@Value("${module.name}") String moduleName) {
        return new ModuleController(moduleName);
    }
}
