package com.biolab.sistemacontrolemateriais.repositories;

import com.biolab.sistemacontrolemateriais.entities.Movimentacao;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {}
