package ru.otus.pipeline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping(path = "/add/{number}")
    public HttpStatus add (@PathVariable long number) {
        businessService.add(number);
        return HttpStatus.OK;
    }
}
