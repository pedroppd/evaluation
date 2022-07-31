package br.com.cvccorp.evaluationservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "travel_package_evaluation")
public class TravelPackageEvaluation implements Serializable {

    @Id
    private String uuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "travel_package_uuid")
    private TravelPackage travel_package_uuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "evaluation_uuid")
    private Evaluation evaluation_uuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_uuid")
    private User user_uuid;
    private Float travel_note;
    private String image_url;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
