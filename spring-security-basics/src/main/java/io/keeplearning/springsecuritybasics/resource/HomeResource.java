package io.keeplearning.springsecuritybasics.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String getContent() {
        return "Hello";
    }

    @GetMapping("/user")
    public String getCUser() {
        return "Hello User";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "Hello Admin";
    }
}
