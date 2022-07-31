package br.com.cvccorp.evaluationservice.controllers;

import br.com.cvccorp.evaluationservice.config.dto.InternalServerError;
import br.com.cvccorp.evaluationservice.repositories.dto.TravelPackageDTO;
import br.com.cvccorp.evaluationservice.services.EvaluationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/evaluation")
@RestController
@AllArgsConstructor
public class TravelPackageQuestionController {
    private final EvaluationService evaluationService;

    @GetMapping("/{travelPackageUuid}")
    public ResponseEntity<List<TravelPackageDTO>> getEvaluationByTravelPackageUuid(@PathVariable String travelPackageUuid,
                                                                               @RequestParam(required = false) String keyword) throws InternalServerError {
        List<TravelPackageDTO> result = evaluationService.getEvaluationByTravelPackageUuid(travelPackageUuid, keyword);
        return ResponseEntity.ok().body(result);
    }
}
