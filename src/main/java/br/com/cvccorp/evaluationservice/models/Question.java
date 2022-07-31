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
@Table(name = "questions")
public class Question implements Serializable {
    @Id
    private String uuid;
    private String question;
}
