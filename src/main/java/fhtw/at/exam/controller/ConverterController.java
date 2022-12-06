package fhtw.at.exam.controller;

import fhtw.at.exam.service.ConverterService;
import org.springframework.cglib.core.Converter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {
    ConverterService service = new ConverterService();

    public ConverterController(ConverterService service){
        this.service = service;
    }

    @GetMapping("InchToCentimeter/{number}")
    double takeInM(@PathVariable double number){
        service.takeInInch(number);
        return service.getNumber();
    }

    @GetMapping("YardToMeter/{number}")
    double takeInCm(@PathVariable double number){
        service.takeInYard(number);
        return service.getNumber();
    }
}
