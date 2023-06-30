package com.example.service;

import com.example.model.Pagamento;
import com.example.repository.PagamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    public List<Pagamento> getAllPagamentos() {
        return pagamentoRepository.findAll();
    }

    public Pagamento createPagamento(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }
    public Optional<Pagamento> getPagamentoById(Integer id) {
        return pagamentoRepository.findById(id);
    }

    public Pagamento updatePagamento(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    public void deletePagamento(Integer id) {
        pagamentoRepository.deleteById(id);
    }
}