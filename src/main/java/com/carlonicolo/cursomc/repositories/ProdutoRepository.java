package com.carlonicolo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlonicolo.cursomc.domain.Produto;

// Per speficicare che è una interfaccia 
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
