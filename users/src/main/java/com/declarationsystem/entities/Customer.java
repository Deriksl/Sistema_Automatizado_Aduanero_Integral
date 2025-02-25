package com.declarationsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.StringTokenizer;

@Data
@Entity

public class Customer {
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String name;
    private String email;
    private StringTokenizer password;



}
