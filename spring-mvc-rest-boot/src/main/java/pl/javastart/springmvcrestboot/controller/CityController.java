package pl.javastart.springmvcrestboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.javastart.springmvcrestboot.model.City;

@RestController
public class CityController {

    @RequestMapping("/city/{id}")
    public City getCity(@PathVariable(name="id" int id)) {
        return new City(id,"Warszawa",1232);
    }
}