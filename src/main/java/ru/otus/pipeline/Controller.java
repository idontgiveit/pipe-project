package ru.otus.pipeline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import ru.otus.service.BusinessService;

@RestController
public class Controller {

    @Autowired
    BusinessService businessService;

    @GetMapping(path = "/start", produces = "application/json")
    public String start() {
        return "{ \"state\"  : \"started\"}";
    }
}
