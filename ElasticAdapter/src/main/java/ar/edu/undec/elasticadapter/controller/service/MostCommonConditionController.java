package ar.edu.undec.elasticadapter.controller.service;

import ar.edu.undec.elasticadapter.controller.dtomodel.CommonConditionDTO;
import ar.edu.undec.elasticadapter.controller.mapper.CommonConditionDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import usecase.input.IMostCommonConditionsInput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class MostCommonConditionController {

    @Autowired
    IMostCommonConditionsInput mostCommonConditionsInput;

    @GetMapping(value="/commonconditions")
    public ResponseEntity<?> getMostCommonCondition() {
        ResponseEntity<?> response=null;
        Collection<CommonConditionDTO> result= mostCommonConditionsInput.getMostCommonConditions().stream().map(CommonConditionDTOMapper::CoreDTOMapper).collect(Collectors.toCollection(ArrayList::new));
        response=ResponseEntity.ok(result);
        return response;
    }
}


