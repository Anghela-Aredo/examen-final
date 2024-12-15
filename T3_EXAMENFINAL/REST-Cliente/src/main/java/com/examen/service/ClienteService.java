package com.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.examen.model.Client;
import com.examen.repository.IClienteRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ClienteService {

    @Autowired
    private IClienteRepository clienteRepository;

    public Client obtenerClientePorCodigo(String codigoUnico) {
        return clienteRepository.findById(codigoUnico)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado con el código: " + codigoUnico));
    }
    // Nuevo método para guardar un cliente
    public Client crearCliente(Client cliente) {
        return clienteRepository.save(cliente);
    }

}
