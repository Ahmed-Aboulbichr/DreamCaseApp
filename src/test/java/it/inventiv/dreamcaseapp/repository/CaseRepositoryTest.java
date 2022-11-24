package it.inventiv.dreamcaseapp.repository;

import it.inventiv.dreamcaseapp.model.Case;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.*;

@DataJpaTest
public class CaseRepositoryTest {

    @Autowired
    private  CaseRepository caseRepository;

    @Test
    void saveCase(){
        Case c = new Case();
        c.setTitle("Title 234");
        c.setDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        c.setCreationDate(LocalDateTime.now());
        c.setLastUpdateDate(LocalDateTime.now());
        c = caseRepository.save(c);
        assertThat(caseRepository.findById(c.getId()).isPresent()).isTrue();
    }

    @Test
    void deleteCase(){
        caseRepository.deleteAll();
        assertThat(caseRepository.count()).isEqualTo(0);
    }

}
