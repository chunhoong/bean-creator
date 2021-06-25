package com.chunhoong.beancreator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainApi {

    private DataService dataService;

    @Autowired
    public MainApi(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping
    public ResponseEntity<Data> getData(@RequestParam String country) {
        return new ResponseEntity<>(dataService.getData(), HttpStatus.OK);
    }

}
