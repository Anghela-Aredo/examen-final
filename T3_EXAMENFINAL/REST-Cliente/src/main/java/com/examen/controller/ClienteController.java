package com.examen.controller;

import com.examen.model.Client;
import com.examen.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{codigoUnico}")
    public ResponseEntity<Client> obtenerCliente(@PathVariable String codigoUnico) {
        return ResponseEntity.ok(clienteService.obtenerClientePorCodigo(codigoUnico));
    }

    // Nuevo método POST para crear un cliente
    @PostMapping("/agregarCliente")
    public ResponseEntity<Client> crearCliente(@RequestBody Client cliente) {
        Client nuevoCliente = clienteService.crearCliente(cliente);
        return ResponseEntity.ok(nuevoCliente);
    }
}
