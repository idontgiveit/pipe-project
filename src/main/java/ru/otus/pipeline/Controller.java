package ru.otus.pipeline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.service.BusinessService;

import java.util.List;
import java.util.Set;

@RestController
public class Controller {

    @Autowired
    BusinessService businessService;

    @GetMapping(path = "/start", produces = "application/json")
    public String start() {
        return "{ \"state\"  : \"started\"}";
    }

    @GetMapping(path = "/add/{number}")
    public Set<Long> add(@PathVariable long number) {
        businessService.add(number);
        return businessService.list();
    }

    @GetMapping(path = "/delete/{number}")
    public Set<Long> delete(@PathVariable long number) {
        businessService.remove(number);
        return businessService.list();
    }

    @GetMapping(path = "/list")
    public Set<Long> list() {
        return businessService.list();
    }
}
