package com.instaclustr.jfleming.devweek.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.instaclustr.jfleming.Library;

@RestController
public class DemoEndpoint {

    private final Library library;

    public DemoEndpoint(){
        library = new Library();
    }

    @GetMapping("/{testString}")
    String test(@PathVariable String testString) {
        boolean value = library.isStringEmptyOrNull(testString);
        return Boolean.toString(value);
    }

    @GetMapping("/greet/{name}")
    String sayHiTo(@PathVariable String name) {
        return library.greetUser(name);
    }
}
