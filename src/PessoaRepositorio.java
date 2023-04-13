package br.com.senai.pessoa.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.pessoa.modelo.Modelo;

@Repository
public interface PessoaRepositorio extends CrudRepository<Modelo,Long>{

   
}

