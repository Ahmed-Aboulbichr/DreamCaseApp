package it.inventiv.dreamcaseapp.web;

import it.inventiv.dreamcaseapp.exception.CaseNotFoundException;
import it.inventiv.dreamcaseapp.model.Case;
import it.inventiv.dreamcaseapp.service.CaseService;
import it.inventiv.dreamcaseapp.service.CaseServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
@AllArgsConstructor
public class CaseController {

    private CaseServiceImp caseService;

    @GetMapping("/cases/{id}")
    public ResponseEntity<Case> findCaseById(@PathVariable Long id) throws CaseNotFoundException {
        return new ResponseEntity<>(caseService.getCase(id), HttpStatus.OK);
    };


    @PostMapping("/cases")
    public ResponseEntity<Case> createCase(@Valid @RequestBody Case c){
        return new ResponseEntity<>(caseService.createCase(c), HttpStatus.CREATED);
    }

    @PutMapping("/cases/{id}")
    public ResponseEntity<Case> updateCase(@PathVariable Long id,@Valid @RequestBody Case c) throws CaseNotFoundException {
        return new ResponseEntity<>(caseService.updateCase(id, c), HttpStatus.OK);
    }

    @DeleteMapping("cases/{id}")
    public ResponseEntity deleteCategorie(@PathVariable Long id){
        caseService.deleteCase(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
