package com.example.jazs22628nbp.controllers;


import com.example.jazs22628nbp.models.Root;
import com.example.jazs22628nbp.services.NbpService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NbpController {

    private final NbpService nbpService;

    public NbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }

    @GetMapping("/currency/{code}/{startDate}/{endDate}/")
    public ResponseEntity<Root> getCurrency(@PathVariable("code") String code,
                                            @PathVariable("startDate") String startDate,
                                            @PathVariable("endDate") String endDate
                                            ){
        return ResponseEntity.ok(nbpService.getCurrency(code,startDate,endDate));
    }
}
