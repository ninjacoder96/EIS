package com.seebox.securities.tradingplatform.EmpInformationSystem.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}