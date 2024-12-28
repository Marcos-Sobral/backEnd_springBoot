package com.example.demo.entity;

//import org.springframework.cglib.core.Local;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Estudante {
    private Long id;
    private String nome;
    private String email;
    private LocalDate dataNascimento;
}

