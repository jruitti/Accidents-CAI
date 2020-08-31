package ar.edu.undec.accidents.mongoadapter.controller.service;

import usecase.input.IAccidentsBetweenDatesInput;
import ar.edu.undec.accidents.mongoadapter.controller.dtomodel.AccidentDTO;
import ar.edu.undec.accidents.mongoadapter.controller.mapper.AccidentDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class AccidentsBetweenDatesController {

    @Autowired
    IAccidentsBetweenDatesInput accidentsBetweenDatesInput;


    @GetMapping(value="/accidents")
    public ResponseEntity<?> getAccidents(
            @RequestParam(value = "fromDate") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss") LocalDateTime fromDate,
            @RequestParam(value = "toDate") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss") LocalDateTime toDate) {

        ResponseEntity<?> response = null;
        Collection<AccidentDTO> result = accidentsBetweenDatesInput.getAccidentsBetweenDates(fromDate,toDate).stream().map(AccidentDTOMapper::CoreDTOMapper).collect(Collectors.toCollection(ArrayList::new));

        response = ResponseEntity.ok(result);

        return response;
    }

}
