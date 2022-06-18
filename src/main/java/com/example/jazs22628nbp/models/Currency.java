package com.example.jazs22628nbp.models;

import javax.persistence.Id;
import java.time.LocalDateTime;

public class Currency {
    @Id
    Integer id;
    String code;
    String startDate;
    String endDate;
    Double meanCurrency;
    LocalDateTime requestDateTime;
}
