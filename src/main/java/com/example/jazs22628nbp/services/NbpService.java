package com.example.jazs22628nbp.services;


import com.example.jazs22628nbp.models.Root;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class NbpService {
    private final RestTemplate restTemplate;

    private static final String NPB_URL = "http://api.nbp.pl/api/exchangerates/rates/";
    private static final String table = "a";

    public NbpService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;

    }

    public Root getCurrency(String code, String startDate,String endDate){
        Root response = restTemplate.getForObject(NPB_URL+table+"/{code}/{startDate}/{endDate}//",Root.class,code,startDate,endDate);
        return response;
    }
}
