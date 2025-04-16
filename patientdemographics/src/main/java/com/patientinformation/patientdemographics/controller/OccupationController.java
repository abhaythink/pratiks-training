package com.patientinformation.patientdemographics.controller;


import com.patientinformation.patientdemographics.dto.OccupationDto;
import com.patientinformation.patientdemographics.entity.Occupation;
import com.patientinformation.patientdemographics.service.OccupationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/occuptions")
public class OccupationController {

    private final OccupationService service;

    public OccupationController(OccupationService service) {
        this.service = service;
    }


    @PostMapping("/add")
    public ResponseEntity<Occupation> create(@RequestBody OccupationDto occupationDto) {
        return ResponseEntity.ok(service.add(occupationDto));
    }

    @GetMapping("/all")
    public List<Occupation> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Occupation> getById(@PathVariable Long id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Occupation> update(@PathVariable Long id, @RequestBody OccupationDto updatedOccupation) {
        return service.getById(id)
                .map(existing -> {
                    updatedOccupation.setId(id);
                    return ResponseEntity.ok(service.add(updatedOccupation));
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