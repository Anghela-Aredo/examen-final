package com.examen.feignclient;

import com.examen.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "REST-Productos")
public interface ProductoFeignClient {

    @GetMapping("/api/prodcutos/{codigoUnico}")
    List<Product> obtenerProductosPorCodigo(@PathVariable("codigoUnico") String codigoUnico);
}
