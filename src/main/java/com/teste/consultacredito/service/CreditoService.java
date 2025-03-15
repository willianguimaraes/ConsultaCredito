package com.teste.consultacredito.service;

import com.teste.consultacredito.model.Credito;
import com.teste.consultacredito.repository.CreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditoService {

    private final CreditoRepository creditoRepository;

    @Autowired
    public CreditoService(CreditoRepository creditoRepository) {
        this.creditoRepository = creditoRepository;
    }

    public List<Credito> getAll() {
        return creditoRepository.findAll();
    }

    public Credito findByNumeroCredito(String numeroCredito) {
        return creditoRepository.findByNumeroCredito(numeroCredito);
    }
}
