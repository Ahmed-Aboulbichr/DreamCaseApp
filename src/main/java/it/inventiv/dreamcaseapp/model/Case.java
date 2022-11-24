package it.inventiv.dreamcaseapp.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

@Entity(name = "CaseDB")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Case {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime creationDate;

    private LocalDateTime lastUpdateDate;

    @Length(max = 255)
    private String title;

    @Length(max = 2056)
    private String description;

}
