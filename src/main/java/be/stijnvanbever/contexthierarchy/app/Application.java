package be.stijnvanbever.contexthierarchy.app;

import be.stijnvanbever.contexthierarchy.modulea.ModuleAConfiguration;
import be.stijnvanbever.contexthierarchy.moduleb.ModuleBConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .parent(Application.class)
                .child(ModuleAConfiguration.class)
                .sibling(ModuleBConfiguration.class)
                .run(args);
    }
}
