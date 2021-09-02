package com.instaclustr.jfleming.devweek.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.instaclustr.jfleming.Library;

@RestController
public class DemoEndpoint {
    @GetMapping("/{testString}")
    String test(@PathVariable String testString) {
        Library lib = new Library();
        boolean value = lib.isStringEmptyOrNull(testString);
        return Boolean.toString(value);
    }
}
