package com.carlonicolo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.carlonicolo.cursomc.domain.Estado;

// Per speficicare che è una interfaccia 
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
