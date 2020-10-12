package io.keeplearning.springsecuritybasics.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/hello")
    public String getContent() {
        return "Hello";
    }
}
