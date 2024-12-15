package com.examen.service;

import com.examen.entity.Client;
import com.examen.entity.Product;
import com.examen.feignclient.ClienteFeignClient;
import com.examen.feignclient.ProductoFeignClient;
import com.examen.model.DetalleRespuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DetalleService {

    @Autowired
    private ClienteFeignClient clienteFeignClient;

    @Autowired
    private ProductoFeignClient productoFeignClient;

    public DetalleRespuesta obtenerDetallesPorCodigoUnico(String codigoUnico) {
        Client cliente = clienteFeignClient.obtenerClientePorCodigo(codigoUnico);
        List<Product> productos = productoFeignClient.obtenerProductosPorCodigo(codigoUnico);

        DetalleRespuesta  detalles = new DetalleRespuesta ();
        detalles.setCliente(cliente);
        detalles.setProductos(productos);
        return detalles;
    }
}
