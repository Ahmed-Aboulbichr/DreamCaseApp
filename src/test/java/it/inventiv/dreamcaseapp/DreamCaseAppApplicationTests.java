package it.inventiv.dreamcaseapp;

import it.inventiv.dreamcaseapp.service.CaseService;
import it.inventiv.dreamcaseapp.web.CaseController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class DreamCaseAppApplicationTests {

    @Autowired
    private CaseController caseController;

    @Test
    @DisplayName("First example test case")
    void contextLoads() {
        assertThat(caseController).isNotNull();
    }

}
