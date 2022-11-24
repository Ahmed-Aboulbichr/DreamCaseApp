package it.inventiv.dreamcaseapp.repository;

import it.inventiv.dreamcaseapp.model.Case;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseRepository extends CrudRepository<Case, Long> {
}
