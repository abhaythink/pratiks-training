package com.trainingspringboot.pratik.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {


     @GetMapping("/filter/names")
    public Names filteringnames(){
        return new Names("Pratik","Karan","Abhay","Kedar");
    }
    @GetMapping("/filter/surnames")
    public MappingJacksonValue filteringsurnames(){
        Surnames surnames = new Surnames("Lagad", "Charakatle", "Ahire", "Ganmote");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(surnames );
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("surname1","surname3");
        FilterProvider filters= new SimpleFilterProvider().addFilter("SurnamesFilter",filter);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue ;
    }

    @GetMapping("/filter/surnames-list")
    public MappingJacksonValue filteringsurnameslist(){
        List<Surnames> list = Arrays.asList(new Surnames("Lagad", "Charakatle", "Ahire", "Ganmote"),
                new Surnames("ABC", "XYZ", "PQR", "JKL"));
        MappingJacksonValue mappingJacksonValue= new MappingJacksonValue(list);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("surname2","surname3");
        FilterProvider filters= new SimpleFilterProvider().addFilter("SurnamesFilter",filter);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }



}
