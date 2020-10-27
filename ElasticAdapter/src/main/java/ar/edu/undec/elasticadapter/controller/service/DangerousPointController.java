package ar.edu.undec.elasticadapter.controller.service;

import ar.edu.undec.elasticadapter.controller.dtomodel.DangerousPointDTO;
import ar.edu.undec.elasticadapter.controller.mapper.DangerousPointDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import usecase.input.IDangerousPointInput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class DangerousPointController {

    @Autowired
    private IDangerousPointInput dangerousPointInput;

    @GetMapping(value="/dangerousPoints")
    public ResponseEntity<?> getDangerousPoints(@RequestParam(value="radiusInKm") float radiusInKm)
    {
        ResponseEntity<?> response=null;
        Collection<DangerousPointDTO> result= dangerousPointInput.getDangerousPoints(radiusInKm)
                .stream().map(DangerousPointDTOMapper::CoreDTOMapper).collect(Collectors.toCollection(ArrayList::new));
        response=ResponseEntity.ok(result);
        return response;
    }
}
