package com.Semilla.Market.persistence.crud;

import com.Semilla.Market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {


    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);//Nuestro primer Query Method

    Optional<List<Producto>> findBycantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
