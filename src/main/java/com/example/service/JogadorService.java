package com.example.service;

import com.example.model.Jogador;
import com.example.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    public List<Jogador> getAllJogadores() {
        return jogadorRepository.findAll();
    }

    public Jogador createJogador(Jogador jogador) {
        return jogadorRepository.save(jogador);
    }

    public Optional<Jogador> getJogadorById(Integer id) {
        return jogadorRepository.findById(id);
    }

    public Jogador updateJogador(Integer id, Jogador jogadorData) {
        Jogador jogador = jogadorRepository.findById(id).orElse(null);
        if (jogador != null) {
            jogador.setNome(jogadorData.getNome());
            jogador.setEmail(jogadorData.getEmail());
            jogador.setDatanasc(jogadorData.getDatanasc());
            return jogadorRepository.save(jogador);
        }
        return null;
    }

    public void deleteJogador(Integer id) {
        jogadorRepository.deleteById(id);
    }
}