package br.com.cvccorp.evaluationservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "evaluations")
public class Evaluation implements Serializable {
    @Id
    private String uuid;
    private String question;
    @OneToMany(mappedBy = "evaluation_uuid")
    private List<TravelPackageEvaluation> travelPackageEvaluation;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
