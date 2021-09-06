package com.instaclustr.jfleming.devweek.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.instaclustr.jfleming.Library;

@RestController
public class GreetingEndpoint {

    private final Library library;

    public GreetingEndpoint(){
        library = new Library();
    }

    @GetMapping("/greet/{name}")
    String sayHiTo(@PathVariable String name) {
        return library.greetUser(name);
    }

    @GetMapping("/goodbye/{name}")
    String sayByeTo(@PathVariable String name) {
        return library.byeUser(name);
    }
}
