package br.com.cvccorp.evaluationservice.repositories;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@AllArgsConstructor
@Repository
public class TravelPackageUserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List getEvaluationByKeyWord(String travelPackageUuid, String question) {
        StringBuilder query = new StringBuilder();
        query.append("SELECT q.uuid as uuid, q.question as question, e.travel_note as travelNote, e.travel_comment as travelComment, e.publish_date as publishDate FROM evaluations e " +
                "INNER JOIN travel_package tp ON e.travel_package_uuid = tp.uuid " +
                "INNER JOIN questions q ON q.uuid = e.question_uuid " +
                "WHERE e.travel_package_uuid = '" + travelPackageUuid + "'");

        if (question != null) {
            query.append(" AND e.travel_comment like '%" + question + "%'");
        }
       return entityManager.createNativeQuery(query.toString()).getResultList();
    }
}
