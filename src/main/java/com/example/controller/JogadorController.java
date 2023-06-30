package com.example.controller;

import com.example.model.Jogador;
import com.example.service.JogadorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jogadores")
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @GetMapping
    public ResponseEntity<List<Jogador>> getAllJogadores() {
        List<Jogador> jogadores = jogadorService.getAllJogadores();
        return new ResponseEntity<>(jogadores, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Jogador> createJogador(@RequestBody Jogador jogador) {
        Jogador novoJogador = jogadorService.createJogador(jogador);
        return new ResponseEntity<>(novoJogador, HttpStatus.CREATED);
    }
}