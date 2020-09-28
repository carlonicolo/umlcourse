package com.carlonicolo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.carlonicolo.cursomc.domain.ItemPedido;

// Per speficicare che è una interfaccia 
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
