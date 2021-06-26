package com.chunhoong.beancreator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataApi {

    private DataService dataService;

    @Autowired
    public DataApi(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping
    public ResponseEntity<Data> getData() {
        return new ResponseEntity<>(dataService.getData(), HttpStatus.OK);
    }

}
