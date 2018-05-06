package com.larry.webservice.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class webController {

    @GetMapping("/")
    public String main() {
        return "main"; // (prefix: src/main/resources/templates, suffix: .hbs)
    }


}
