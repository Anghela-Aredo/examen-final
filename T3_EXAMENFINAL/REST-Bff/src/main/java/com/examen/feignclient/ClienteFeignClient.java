package com.examen.feignclient;

import com.examen.entity.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "REST-Cliente")
public interface ClienteFeignClient {

    @GetMapping("/api/clientes/{codigoUnico}")
    Client obtenerClientePorCodigo(@PathVariable("codigoUnico") String codigoUnico);
}