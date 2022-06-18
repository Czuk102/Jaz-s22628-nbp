package com.example.jazs22628nbp.controllers;

import com.example.jazs22628nbp.services.NbpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.criteria.Root;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private final NbpService nbpService;

    public RestController(NbpService nbpService) {
        this.nbpService = nbpService;
    }


    @GetMapping("/currency/{code}")
    public ResponseEntity<Root> getCurrency(@PathVariable("code") String code,
                                            @RequestParam(required = false, defaultValue = "1") Integer topCount) {
        return ResponseEntity.ok(nbpService.getCurrency(code, topCount));
    }
}