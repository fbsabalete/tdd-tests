package com.fernando.tddjunit.repository;

import com.fernando.tddjunit.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
