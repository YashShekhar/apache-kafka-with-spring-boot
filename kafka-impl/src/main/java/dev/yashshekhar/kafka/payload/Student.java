package dev.yashshekhar.kafka.payload;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String firstName;
    private String lastName;
}