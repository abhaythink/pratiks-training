package com.patientinformation.patientdemographics.controller;


import com.patientinformation.patientdemographics.entity.RelatedPerson;
import com.patientinformation.patientdemographics.service.RelatedPersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/related-persons")
public class RelatedPersonController {

    private final RelatedPersonService service;

    public RelatedPersonController(RelatedPersonService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<RelatedPerson> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RelatedPerson> getById(@PathVariable Long id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/add")
    public ResponseEntity<RelatedPerson> create(@RequestBody RelatedPerson relatedPerson) {
        return ResponseEntity.ok(service.save(relatedPerson));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<RelatedPerson> update(@PathVariable Long id, @RequestBody RelatedPerson updatedPerson) {
        return service.getById(id)
                .map(existing -> {
                    updatedPerson.setId(id);
                    return ResponseEntity.ok(service.save(updatedPerson));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (service.getById(id).isPresent()) {
            service.delete(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
