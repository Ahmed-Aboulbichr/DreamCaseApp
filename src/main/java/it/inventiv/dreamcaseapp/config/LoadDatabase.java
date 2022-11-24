package it.inventiv.dreamcaseapp.config;

import it.inventiv.dreamcaseapp.model.Case;
import it.inventiv.dreamcaseapp.repository.CaseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(CaseRepository caseRepository){
        return args -> {
            Stream.of("Title1", "Title2", "Title3")
                    .forEach( title -> {
                        log.info(title);
                        Case c = new Case();
                        c.setTitle(title);
                        c.setCreationDate(LocalDateTime.now());
                        c.setLastUpdateDate(LocalDateTime.now());
                        c.setDescription(title + UUID.randomUUID());
                        caseRepository.save(c);
                    });
        };
    }
}
