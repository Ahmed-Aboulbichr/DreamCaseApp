package it.inventiv.dreamcaseapp;

import it.inventiv.dreamcaseapp.model.Case;
import it.inventiv.dreamcaseapp.repository.CaseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
@Slf4j
public class DreamCaseAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DreamCaseAppApplication.class, args);
    }

}
