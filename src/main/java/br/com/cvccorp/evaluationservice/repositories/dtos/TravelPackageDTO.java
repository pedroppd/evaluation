package br.com.cvccorp.evaluationservice.repositories.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
@Builder
@Getter
@Setter
@AllArgsConstructor
public class TravelPackageDTO implements Serializable {
    private String uuid;
    private String question;
    private Float travelNote;
    private String travelComment;
    private String publishDate;
}
