package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Estudante;
import com.example.demo.service.EstudanteService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/estudantes")
@AllArgsConstructor
public class EstudanteController {

    private EstudanteService estudanteService;

    @GetMapping("/{id}")
    public ResponseEntity<Estudante> buscarEstudantePorId(@RequestParam Long id) {
        return estudanteService.buscarEstudantePorId(id);
	}
	
    @GetMapping
	public List<Estudante> buscarTodosEstudantes() {
        return estudanteService.buscarTodosEstudantes();
	}
	
    @PostMapping
	public ResponseEntity<Estudante> cadastrarEstudante(@RequestBody Estudante estudante) {
        return estudanteService.cadastrarEstudante(estudante);
	}
	
    @PutMapping("/{id}")
	public ResponseEntity<Estudante> atualizarEstudante(@RequestParam Estudante estudante) {
        return estudanteService.atualizarEstudante(estudante);

	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> removerEstudante(@RequestParam Long id) {
        return estudanteService.removerEstudante(id);

	}

}