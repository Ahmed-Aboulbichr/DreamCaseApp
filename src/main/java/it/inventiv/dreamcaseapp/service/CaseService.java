package it.inventiv.dreamcaseapp.service;

import it.inventiv.dreamcaseapp.exception.CaseNotFoundException;
import it.inventiv.dreamcaseapp.model.Case;

public interface CaseService {

    Case createCase(Case c);

    Case updateCase(Long id, Case c) throws CaseNotFoundException;

    void deleteCase(Long id);

    Case getCase(Long id) throws CaseNotFoundException;

}
