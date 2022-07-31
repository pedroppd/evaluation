package br.com.cvccorp.evaluationservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "travel_package")
public class TravelPackage implements Serializable {
    @Id
    private String uuid;
    private String description;
    private LocalDateTime travelDate;
    private String localization;
    private LocalDateTime initialDate;
    private LocalDateTime endDate;
    @OneToMany(mappedBy = "travelPackage")
    private List<Evaluation> TravelPackageUser;
}
