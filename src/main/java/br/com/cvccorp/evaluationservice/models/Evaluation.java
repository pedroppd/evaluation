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
@Table(name = "evaluations")
public class Evaluation implements Serializable {
    @Id
    private String uuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "travel_package_uuid")
    private TravelPackage travelPackage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_uuid")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_uuid")
    private Question question;
    private Float travelNote;
    private String travelComment;
    private String imageUrl;
    private LocalDateTime publishDate;
}
