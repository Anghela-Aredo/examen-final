package com.examen.service;

import com.examen.model.Product;
import com.examen.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private IProductoRepository productoRepository;

    public List<Product> obtenerProductosPorCodigoUnico(String codigoUnico) {
        List<Product> productos = productoRepository.findByCodigoUnico(codigoUnico);
        if (productos.isEmpty()) {
            throw new RuntimeException("No se encontraron productos para el código: " + codigoUnico);
        }
        return productos;
    }

    // Método para crear un producto
    public Product crearProducto(Product product) {
        return productoRepository.save(product);
    }
}