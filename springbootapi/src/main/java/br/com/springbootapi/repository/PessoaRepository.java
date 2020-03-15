package br.com.springbootapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springbootapi.entity.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> { }