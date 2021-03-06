package ar.edu.undec.elasticadapter.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import usecase.input.IAverageDistanceInput;

@RestController
public class AverageDistanceController {

    @Autowired
    private IAverageDistanceInput averageDistanceInput;

    @GetMapping(value="/averageDistance")
    public ResponseEntity getAverageDistance() {

        ResponseEntity<?> response=null;
        Double result= averageDistanceInput.getAverageDistance();
        response=ResponseEntity.ok(result);
        return response;
    }
}
