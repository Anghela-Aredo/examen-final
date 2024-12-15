package com.examen.repository;

import com.examen.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository<Product, Long> {
	 @Query("SELECT p FROM Product p WHERE p.codigo_Unico = :codigoUnico")
	    List<Product> findByCodigoUnico(@Param("codigoUnico") String codigoUnico);
}
