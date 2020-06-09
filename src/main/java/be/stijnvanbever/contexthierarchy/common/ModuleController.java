package be.stijnvanbever.contexthierarchy.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/module")
public class ModuleController {
    private final String moduleName;

    public ModuleController(String moduleName) {
        this.moduleName = moduleName;
    }

    @GetMapping
    public String helloWorld() {
        return "Hello world from " + moduleName;
    }
}