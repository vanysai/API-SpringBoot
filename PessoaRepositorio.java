package br.com.jaizasurtos.pessoa.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.jaizasurtos.pessoa.modelos.PessoaModelo;

@Repository
public interface PessoaRepositorio extends CrudRepository<PessoaModelo,Long>{

   
}
