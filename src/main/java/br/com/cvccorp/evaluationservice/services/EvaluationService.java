package br.com.cvccorp.evaluationservice.services;

import br.com.cvccorp.evaluationservice.config.dto.InternalServerError;
import br.com.cvccorp.evaluationservice.repositories.TravelPackageUserRepository;
import br.com.cvccorp.evaluationservice.repositories.dto.TravelPackageDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@AllArgsConstructor
@Service
public class EvaluationService {
    private final TravelPackageUserRepository travelPackageUserRepository;

    public List<TravelPackageDTO> getEvaluationByTravelPackageUuid(String travelPackageUuid, String keyword) throws InternalServerError {
        List<TravelPackageDTO> TravelPackageUserDTO = new ArrayList<>();
        try {
            List<Object[]> resultList = travelPackageUserRepository.getEvaluationByKeyWord(travelPackageUuid, keyword);
            resultList.forEach(evaluation -> {
                TravelPackageUserDTO.add(new TravelPackageDTO((String) evaluation[0], (String) evaluation[1], (Float) evaluation[2], (String) evaluation[3], evaluation[4].toString()));
            });
            return TravelPackageUserDTO;
        } catch (Exception ex) {
            String errorMessage = (ex.getMessage() != null) ? ex.getMessage() : "Internal Server Error";
            log.error(errorMessage);
            throw new InternalServerError(errorMessage);
        }
    }
}
