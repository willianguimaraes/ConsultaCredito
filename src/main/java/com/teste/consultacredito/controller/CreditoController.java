package com.teste.consultacredito.controller;

import com.teste.consultacredito.model.Credito;
import com.teste.consultacredito.service.CreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("creditos")
public class CreditoController {

    private CreditoService creditoService;

    @Autowired
    CreditoController(CreditoService creditoService) {
        this.creditoService = creditoService;
    }

    @GetMapping
    public ResponseEntity<List<Credito>> getAll () {
        List<Credito> creditoLista = creditoService.getAll();
        return ResponseEntity.ok().body(creditoLista);
    }

    @GetMapping(path = "/credito/{numeroCredito}")
    public ResponseEntity<Credito> findByNumeroCredito(@PathVariable String numeroCredito) {
        return ResponseEntity.ok().body(creditoService.findByNumeroCredito(numeroCredito));
    }
}
