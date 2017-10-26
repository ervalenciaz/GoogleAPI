package com.googleapi;

import com.googleapi.domain.QueryRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/googleapi")
public class GoogleAPIController {

    @RequestMapping(method = RequestMethod.GET)
    public String getAll() {
        return "Hola Mundo!!!!";
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/webhook")
    public ResponseEntity webhook(QueryRequest request) {
        return new ResponseEntity<>("HOLAAA!!", HttpStatus.OK);
    }

}
