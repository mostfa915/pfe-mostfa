package com.example.pfev2.controllers;
import com.example.pfev2.entites.Incident;
import com.example.pfev2.repositorys.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/incidents")
public class IncidentController {
    @Autowired
    private IncidentRepository incidentRepository;
    @GetMapping
    public List<Incident> getAllIncidents() {
        return incidentRepository.findAll();
    }
    @GetMapping("/{id}")
    public Incident getIncidentById(@PathVariable Long id) {
        return incidentRepository.findById(id).orElseThrow();
    }
    @PostMapping
    public Incident createIncident(@RequestBody Incident incident) {
        return incidentRepository.save(incident);
    }
    @PutMapping("/{id}")
    public Incident updateIncident(@PathVariable Long id, @RequestBody Incident incident) {
        incident.setId(id);
        return incidentRepository.save(incident);
    }
    @DeleteMapping("/{id}")
    public void deleteIncident(@PathVariable Long id) {
        incidentRepository.deleteById(id);
    }
}