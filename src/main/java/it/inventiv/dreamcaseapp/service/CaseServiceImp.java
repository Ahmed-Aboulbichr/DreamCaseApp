package it.inventiv.dreamcaseapp.service;

import it.inventiv.dreamcaseapp.exception.CaseNotFoundException;
import it.inventiv.dreamcaseapp.model.Case;
import it.inventiv.dreamcaseapp.repository.CaseRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
@Slf4j
public class CaseServiceImp implements CaseService{

    private CaseRepository caseRepository;

    @Override
    public Case createCase(Case c) {
        c.setCreationDate(LocalDateTime.now());
        c.setLastUpdateDate(LocalDateTime.now());
        return caseRepository.save(c);
    }

    @Override
    public Case updateCase(Long id, Case c) throws CaseNotFoundException {
        return caseRepository.findById(id)
                .map(c1 -> {
                    c.setTitle(c1.getTitle());
                    c.setDescription(c1.getDescription());
                    c.setLastUpdateDate(LocalDateTime.now());
                    return caseRepository.save(c);
                })
                .orElseThrow(()-> new CaseNotFoundException("Case Not Found"));
    }

    @Override
    public void deleteCase(Long id) {
        caseRepository.deleteById(id);
    }

    @Override
    public Case getCase(Long id) throws CaseNotFoundException {
        return caseRepository.findById(id).orElseThrow(()-> new CaseNotFoundException("Case Not Found"));
    }
}
