package com.teste.consultacredito.repository;

import com.teste.consultacredito.model.Credito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditoRepository extends JpaRepository<Credito, Long> {

    Credito findByNumeroCredito(String numeroCredito);
}
