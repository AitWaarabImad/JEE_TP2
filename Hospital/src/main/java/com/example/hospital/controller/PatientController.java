package com.example.hospital.controller;


import com.example.hospital.entities.Patient;
import com.example.hospital.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/patient")
public class PatientController {

    private PatientRepository patientRepository;




    @GetMapping("/home")
    public List<Patient> getAll()
    {
        return patientRepository.findAll();
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient)
    {
        return patientRepository.save(patient);
    }



}
