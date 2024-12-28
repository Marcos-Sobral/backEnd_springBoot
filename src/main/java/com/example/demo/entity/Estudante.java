package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Estudante {
	private Long id;
	private String nome;
	private String email;
	//private LocalDate dataNascimento;
	
	
}
