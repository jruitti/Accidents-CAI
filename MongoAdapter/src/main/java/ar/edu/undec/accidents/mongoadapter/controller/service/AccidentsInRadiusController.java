package ar.edu.undec.accidents.mongoadapter.controller.service;

import ar.edu.undec.accidents.mongoadapter.controller.dtomodel.AccidentDTO;
import ar.edu.undec.accidents.mongoadapter.controller.mapper.AccidentDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import usecase.input.IAccidentsInRadiusInput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class AccidentsInRadiusController {

    @Autowired
    IAccidentsInRadiusInput accidentsInRadiusInput;


    @GetMapping(value="/accidentsInRadius")
    public ResponseEntity<?> getAccidentsInRadius(
            @RequestParam(value = "longitude") float longitude,
            @RequestParam(value = "latitude") float latitude,
            @RequestParam(value = "radiusInKm") float radiusInKm) {
        ResponseEntity<?> response = null;
        Collection<AccidentDTO> result = accidentsInRadiusInput.getAccidentsInRadius(longitude,latitude,radiusInKm).stream().map(AccidentDTOMapper::CoreDTOMapper).collect(Collectors.toCollection(ArrayList::new));
        response = ResponseEntity.ok(result);

        return response;
    }
}
