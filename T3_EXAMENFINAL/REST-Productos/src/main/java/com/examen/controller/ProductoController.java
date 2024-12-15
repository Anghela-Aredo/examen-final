package com.examen.controller;

import com.examen.model.Product;
import com.examen.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/prodcutos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/{codigoUnico}")
    public ResponseEntity<List<Product>> obtenerProductos(@PathVariable String codigoUnico) {
        return ResponseEntity.ok(productoService.obtenerProductosPorCodigoUnico(codigoUnico));
    }
    // Método POST para crear un producto
    @PostMapping("/agregarProducto")
    public ResponseEntity<Product> crearProducto(@RequestBody Product product) {
        Product nuevoProducto = productoService.crearProducto(product);
        return ResponseEntity.ok(nuevoProducto);
    }
}
