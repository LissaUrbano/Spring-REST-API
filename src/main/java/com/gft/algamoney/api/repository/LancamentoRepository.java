package com.gft.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gft.algamoney.api.model.Lancamento;
import com.gft.algamoney.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
