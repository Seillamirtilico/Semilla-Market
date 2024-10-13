package com.Semilla.Market.persistence;

import com.Semilla.Market.persistence.crud.ProductoCrudRepository;
import com.Semilla.Market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public ProductoRepository(ProductoCrudRepository productoCrudRepository) {
        this.productoCrudRepository = productoCrudRepository;
    }

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc( idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad) {
        return productoCrudRepository.findBycantidadStockLessThanAndEstado(cantidad,true);

    }



}
